package com.common;

/**
 * Created by godfrey on 16-9-14.
 */
import java.util.LinkedList;
import java.util.List;

public class LCS {
  private class SuffixNode {
    private String key;
    private List<SuffixNode> children = new LinkedList<SuffixNode>();

    //use "#" for terminal char
    private boolean terminal;

    public SuffixNode() {
      this.key = "";
    }

    public SuffixNode(String key) {
      this.key = key;
    }

    public String toString() {
      return this.key + (this.terminal ? "#" : "") + "(" + children.size() + ")";
    }

  }

  private SuffixNode root;
  private String text;
  //terminators should be ordered according to input strings
  private char[] terminators;

   public LCS(String text, char[] terminators) {
    this.text = text;
    this.terminators = terminators;
  }

  private void insert(SuffixNode currNode, String key, int startIndex) throws Exception {
    boolean done = false;
    for (int i = 0; i < currNode.children.size(); i++) {
      SuffixNode child = currNode.children.get(i);

      //use min(child.key.length, key.length)
      int len = child.key.length() < key.length() ? child.key.length() :
          key.length();
      int j = 0;
      for (; j < len; j++) {
        if (key.charAt(j) != child.key.charAt(j)) {
          break;
        }
      }
      if (j == 0) {//this child doesn't match any character with the new key
        //order keys by lexi-order
        if (key.charAt(0) < child.key.charAt(0)) {
          //e.g. child="e" (currNode="abc")
          //     abc                     abc
          //    /  /    =========>      / | /
          //   e    f   insert "c"     c# e  f

          SuffixNode node = new SuffixNode(key);
          currNode.children.add(i, node);
          node.terminal = true;
          done = true;
          break;
        } else { //key.charAt(0)>child.key.charAt(0)
          //don't forget to add the largest new key after iterating all children
          continue;
        }
      } else {//current child's key partially matches with the new key; 0<j<=len
        if (j == len) {
          if (key.length() == child.key.length()) {
            if (child.terminal) {
              throw new Exception("Duplicate Key is found when insertion!");
            } else {
              //e.g. child="ab"
              //     ab                    ab#
              //    /  /    =========>    /   /
              //   e    f   insert "ab"  e     f
              child.terminal = true;
            }
          } else if (key.length() > child.key.length()) {
            //e.g. child="ab#"
            //     ab#                    ab#
            //    /  /    ==========>    / | /
            //   e    f   insert "abc"  c# e  f
            String subkey = key.substring(j);
            //recursion
            insert(child, subkey, startIndex + j);
          } else { //key.length()<child.key.length()
            //e.g. child="abc#"
            //     abc#                      ab#
            //    /   /      =========>      /
            //   e     f     insert "ab"    c#
            //                             /  /
            //                            e    f
            String childSubkey = child.key.substring(j); //c
            SuffixNode subChildNode = new SuffixNode(childSubkey);
            subChildNode.terminal = child.terminal;
            subChildNode.children = child.children; //inherited from parent

            child.key = key;  //ab
            child.terminal = true;  //ab#

            child.children = new LinkedList<SuffixNode>();
            child.children.add(subChildNode);
          }
        } else {//0<j<len
          //e.g. child="abc#"
          //     abc#                     ab
          //    /  /     ==========>     / /
          //   e    f   insert "abd"    c#  d#
          //                           /  /
          //                          e    f
          //split at j
          String childSubkey = child.key.substring(j);  //c
          String subkey = key.substring(j); //d

          SuffixNode subChildNode = new SuffixNode(childSubkey);
          subChildNode.terminal = child.terminal;
          subChildNode.children = child.children; //inherited from parent

          //update child's key
          child.key = child.key.substring(0, j);
          //child is not terminal now due to split, it is inherited by subChildNode
          child.terminal = false;

          //Note: no need to merge subChildNode

          SuffixNode node = new SuffixNode(subkey);
          node.terminal = true;
          child.children = new LinkedList<SuffixNode>();
          if (subkey.charAt(0) < childSubkey.charAt(0)) {
            child.children.add(node);
            child.children.add(subChildNode);
          } else {
            child.children.add(subChildNode);
            child.children.add(node);
          }
        }
        done = true;
        break;
      }
    }
    if (!done) {
      SuffixNode node = new SuffixNode(key);
      node.terminal = true;
      currNode.children.add(node);
    }
  }

  public void insert(String suffix, int startIndex) throws Exception {
    if (suffix == null || suffix.length() == 0) return;

    if (root == null) {
      root = new SuffixNode();
    }
    insert(root, suffix, startIndex);
  }

  //build a suffix-tree for a string of text
  public void buildSuffixTree() throws Exception {
    for (int i = 0; i < text.length(); i++) {
      this.insert(text.substring(i), i);
    }
  }

  //for test purpose only
  public void printTree() {
    this.print(0, this.root);
  }

  private void print(int level, SuffixNode node) {
    for (int i = 0; i < level; i++) {
      System.out.format(" ");
    }
    System.out.format("|");
    for (int i = 0; i < level; i++) {
      System.out.format("-");
    }
    if (node.terminal)
      System.out.format("%s#%n", node.key);
    else
      System.out.format("%s%n", node.key);
    for (SuffixNode child : node.children) {
      print(level + 1, child);
    }
  }

  public String findLCS() {
    return findLCS(root);
  }

  //return the longest substring starting with current node (but not including currNode.key)
  private String findLCS(SuffixNode currNode) {
    int maxDepth = currNode.key.length();
    int currDepth = currNode.key.length();

    String longestSubstrSuffix = "";

    for (int i = 0; i < currNode.children.size(); i++) {
      SuffixNode child = currNode.children.get(i);
      if (!child.terminal) {
        int depth = currDepth + child.key.length();

        //terminators are unique, so terminal child is excluded
        boolean containsTerminators = containTerminators(child);
        if (containsTerminators) {
          if (depth > maxDepth) {
            maxDepth = depth;
            longestSubstrSuffix = child.key;
          }

          String longestChildSubstrSuffix = findLCS(child);
          if (longestChildSubstrSuffix.length() > 0) { //not a part of LCS if longestChildSubstrSuffix's lenght is 0
            int maxChildDepth = longestChildSubstrSuffix.length() + depth;
            if (maxChildDepth > maxDepth) {
              maxDepth = maxChildDepth;
              //the substring is relative to currNode
              longestSubstrSuffix = child.key + longestChildSubstrSuffix;
            }
          }
        }
      }
    }


    return longestSubstrSuffix;
  }

  private boolean containTerminators(SuffixNode currNode) {
    boolean[] done = new boolean[terminators.length];
    return containTerminators(currNode, done);
  }

  private boolean containTerminators(SuffixNode currNode, boolean[] done) {
    boolean allDone = false;

    for (int i = 0; i < currNode.children.size(); i++) {
      SuffixNode child = currNode.children.get(i);
      if (child.terminal) {
        //Note: here the order of terminator is important
        for (int j = 0; j < terminators.length; j++) {
          int pos = child.key.indexOf(terminators[j]);
          if (pos >= 0) {
            done[j] = true;
            break;
          }
        }
      } else {
        containTerminators(child, done);
      }

      allDone = true;
      for (int j = 0; j < done.length; j++) {
        if (!done[j]) {
          allDone = false;
          break;
        }
      }
      if (allDone)
        break;
    }

    return allDone;
  }

  public static void main(String[] args) throws Exception {
    System.out.println("****************************");
    System.out.format("LCS for 3 strings:{abc,bcabca,aabcf}%n");
    String text = "abc$bcabca@aabcf%";
    LCS strie = new LCS(text, new char[]{'a'});
  }
}
