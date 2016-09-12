package com.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderReverse {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if(root == null)
      return null;

    int count = 1;
    int sum = 0;
    List<TreeNode> level = new ArrayList<TreeNode>();
    level.add(root);

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    while(count > 0){
      List<Integer> tmp = new ArrayList<Integer>();
      int k = 0;
      for(int i = 0;i < count; i++){
        TreeNode node = level.get(sum+i) ;
        tmp.add(node.val);
        if(node.left != null){
          level.add(node.left);
          k++;
        }else if(node.right != null){
          level.add(node.right);
          k++;
        }
      }
      sum += count;
      count = k;
      result.add(tmp);
    }
    Collections.reverse(result);
    return result;
  }
}
