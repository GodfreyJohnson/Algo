package com.tmp;

public class RebuildBiTree {
	static boolean CanReBuild = true; // ������ʾ�Ƿ��ܹ��ع�������

	public static void main(String[] args) {
		int[] preorder = { 1, 2, 3, 4, 5 };
		int[] inorder = { 3, 2, 4, 1, 5 };
		BitNode proot = rebuildTree2(preorder, 0, inorder, inorder.length - 1,
				inorder.length);
		if (CanReBuild)
			BinTree.PostOrderTraverse(proot);
	}

	public static BitNode rebuildTree(int[] preOrder, int start, int[] inOrder,
			int end, int length) {
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			CanReBuild = false;
			return null;
		}
		int value = preOrder[start];
		BitNode root = new BitNode();
		root.data = value;
		if (length == 1)
			return root;

		int rootIndex = 0;
		while (rootIndex < length) {
			if (value == inOrder[end - rootIndex]) {
				break;
			}
			rootIndex++;
		}
		if (rootIndex >= length) {
			CanReBuild = false;
			return null;
		}
		root.lchild = rebuildTree(preOrder, start + 1, inOrder, end - rootIndex
				- 1, length - 1 - rootIndex);
		root.rchild = rebuildTree(preOrder, start + length - rootIndex,
				inOrder, end, rootIndex);
		return root;
	}

	public static BitNode rebuildTree2(int[] preOrder, int start,
			int[] inOrder, int end, int length) {
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			CanReBuild = false;
			return null;
		}
		int value = preOrder[start];
		BitNode root = new BitNode();
		root.data = value;
		if (length == 1)
			return root;

		int rootIndex = 0;// �����и��ڵ㵹��λ��
		while (rootIndex < length) {
			if (value == inOrder[rootIndex]) {
				break;
			}
			rootIndex++;
		}
		// System.out.println("rootIndex = " + rootIndex);
		// ��������������û���ҵ����ڵ㣬���޷��ع�
		if (rootIndex >= length) {
			CanReBuild = false;
			return null;
		}
		// ����������������
		root.lchild = rebuildTree(preOrder, start + 1, inOrder, rootIndex
				- 1, rootIndex);
		// ����������������
		root.rchild = rebuildTree(preOrder, rootIndex + 1,
				inOrder, end, length - rootIndex - 1);
		return root;
	}
}
