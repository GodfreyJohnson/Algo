package com.offer;

public class RebuildBinaryTreeByPreAndInOrder {
  public static void main(String[] args) {
    int[] preorder = {1, 2, 3, 4, 5};
    int[] inorder = {3, 2, 4, 1, 5};
    BitNode proot = rebuildTree(preorder, 0, inorder, inorder.length - 1);
    PostOrderTraverse(proot, "");
  }

  public static void PostOrderTraverse(BitNode root, String rpn) {
    if (root != null) {
      PostOrderTraverse(root.left, rpn);
      PostOrderTraverse(root.right, rpn);
      rpn += root.data + " ";
    }
  }

  private static BitNode rebuildTree(int[] preorder, int start, int[] inorder, int end) {
    if (preorder == null || preorder.length <= 0 || inorder == null || inorder.length <= 0) {
      return null;
    }

    BitNode root = new BitNode();
    root.data = preorder[start];

    if (start == end)
      return root;

    // get root index in inorder
    int index = 0;
    while (index <= end) {
      if (root.data == inorder[index]) {
        break;
      }
      index++;
    }

    if(end - start < 1) {
      return root;
    }

    if (index - start >= 0)
      root.left = rebuildTree(preorder, start + 1, inorder, index);
    if (index - start < end - start)
      root.right = rebuildTree(preorder, index + 1, inorder, end);

    return root;
  }
}
