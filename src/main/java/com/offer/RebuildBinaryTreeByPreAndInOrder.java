package com.offer;

/**
 * wrong answer, right answer is RebuildBiTree in tmp package
 */
public class RebuildBinaryTreeByPreAndInOrder {
  public static void main(String[] args) {
    int[] preorder = {1, 2, 3, 4, 5};
    int[] inorder = {3, 2, 4, 1, 5};
    BitNode proot = rebuildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    PostOrderTraverse(proot, "");
  }

  public static void PostOrderTraverse(BitNode root, String rpn) {
    if (root != null) {
      PostOrderTraverse(root.left, rpn);
      PostOrderTraverse(root.right, rpn);
      rpn += root.data + " ";
    }
  }

  private static BitNode rebuildTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int inEnd) {
    if (preorder == null || preorder.length <= 0 || inorder == null || inorder.length <= 0) {
      return null;
    }

    BitNode root = new BitNode();
    root.data = preorder[startPre];

    if (startPre == endPre)
      return root;

    // get root index in inorder
    int index = startIn;
    while (index <= inEnd) {
      if (root.data == inorder[index]) {
        break;
      }
      index++;
    }

    if (index == endPre && root.data != inorder[index]) {
      try {
        throw new Exception("invalid input");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    int leftLength = index - startPre;
    int leftPreOrderedEnd = startPre + leftLength;
    if (leftLength >= 0)
      root.left = rebuildTree(preorder, startPre + 1, leftPreOrderedEnd, inorder, startIn, index - 1);
    if (leftLength < endPre - startPre)
      root.right = rebuildTree(preorder, leftPreOrderedEnd + 1, endPre, inorder, index + 1, inEnd);

    return root;
  }
}
