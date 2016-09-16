package com.tmp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class BitNode {
	int data;
	BitNode lchild;
	BitNode rchild;

	public void setNode(int data, BitNode lc, BitNode rc) {
		this.data = data;
		lchild = lc;
		rchild = rc;
	}
}

public class BinTree {
	// ---------1
	// -------2---5
	// -----3---4
	//
	static int counter = 0;

	public static void main(String[] args) {
		BitNode root = new BitNode();
		int[] a = { 1, 2, 3, 0, 0, 4, 0, 0, 5, 0, 0 };

		// root = createBiTree2(root, a, counter);
		// System.out.println("-----�ݹ��������-----");
		// PreOrderTraverse(root);
		// System.out.println("\n-----�ǵݹ��������-----");
		// preorderTraverse(root);
		//
		// System.out.println("\n\n-----�ݹ��������-----");
		// InOrderTraverse(root);
		// System.out.println("\n-----�ǵݹ��������-----");
		// inorderTraverse(root);
		//
		// System.out.println("\n\n-----�ݹ�������-----");
		// PostOrderTraverse(root);
		// System.out.println("\n-----�ǵݹ�������1-----");
		// postorderTraverse(root);
		// System.out.println("\n-----�ǵݹ�������2-----");
		// postorderTraverse2(root);
		//
		// System.out.println("\n\n-----�������-----");
		// levelTraverse(root);
		// System.out.println("\n\ndepth = " + BiTreeDepth(root));
		//
		// System.out.println("------------�ع�������------------");
		// BitNode proot = new BitNode();
		// int[] preorder = { 1, 2, 3, 4, 5 };
		// int[] inorder = { 3, 2, 4, 1, 5 };
		// // ReBuild(preorder, inorder, 5, proot);
		// // RebuildBinaryTree(proot, preorder, inorder, 5);
		// proot = rebuildTree(preorder, 0, inorder, inorder.length - 1,
		// inorder.length);
		// levelTraverse(proot);
		// PostOrderTraverse(proot);
		//
		// System.out.println("\n4�ڵڼ��㣺" + level(root, 4));
		//
		// System.out.println("����Ҷ�ӽڵ�����" + leafNum(root));
		//
		// System.out.println("���ĸ��ڵ�����" + fatherNodes(root));
		//
		// exChange(root);
		// System.out.println("-----�������Ӻ�������-----");
		// levelTraverse(root);
		//
		// System.out.println("\n���нڵ�֮�ͣ�"+getSumByRecursion(root));
	}

	/**
	 * ���������
	 * 
	 * @param root���ڵ�
	 * @param a����Դ
	 * @param i������
	 * @return ���ڵ�
	 */
	public static BitNode createBiTree2(BitNode root, int[] a, int i) {
		if (i < a.length) {
			if (a[i] == 0) {
				root = null;
			} else {
				BitNode lchild = new BitNode();
				BitNode rchild = new BitNode();
				// root.setNode(a[i], createBiTree2(lchild, a, ++counter),
				// createBiTree2(rchild, a, ++counter));
				root.data = a[i];
				root.lchild = createBiTree2(lchild, a, ++counter);
				root.rchild = createBiTree2(rchild, a, ++counter);
			}
		}
		return root;
	}

	// ���ʽڵ�
	public static void visitTNode(BitNode node) {
		System.out.print(node.data + " ");
	}

	// ������������
	public static int BiTreeDepth(BitNode T) {
		int depthval, depthLeft, depthRight;
		if (T == null)
			depthval = 0;
		else if (T.lchild == null && T.rchild == null)
			depthval = 1;
		else {
			depthLeft = BiTreeDepth(T.lchild);
			depthRight = BiTreeDepth(T.rchild);
			depthval = 1 + (depthLeft > depthRight ? depthLeft : depthRight);
		}
		return depthval;
	}

	// �ݹ��������
	public static void PreOrderTraverse(BitNode root) {
		if (root != null) {
			visitTNode(root);
			PreOrderTraverse(root.lchild);
			PreOrderTraverse(root.rchild);
		}
	}

	// �ݹ��������
	public static void InOrderTraverse(BitNode root) {
		if (root != null) {
			InOrderTraverse(root.lchild);
			visitTNode(root);
			InOrderTraverse(root.rchild);
		}
	}

	// �ݹ�������
	public static void PostOrderTraverse(BitNode root) {
		if (root != null) {
			PostOrderTraverse(root.lchild);
			PostOrderTraverse(root.rchild);
			visitTNode(root);
		}
	}

	// �ǵݹ��������
	public static void preorderTraverse(BitNode root) {
		Stack s = new Stack();
		s.push(root);
		while (!s.isEmpty()) {
			BitNode bn = (BitNode) s.pop();
			visitTNode(bn);
			if (bn.rchild != null)
				s.push(bn.rchild);
			if (bn.lchild != null)
				s.push(bn.lchild);
		}
	}

	// �ǵݹ��������
	public static void inorderTraverse(BitNode root) {
		Stack s = new Stack();
		BitNode p = root;
		while (p != null || !s.isEmpty()) {
			if (p != null) {
				s.push(p);
				p = p.lchild;
			} else {
				p = (BitNode) s.pop();
				visitTNode(p);
				p = p.rchild;
			}
		}
	}

	// �ǵݹ�������1
	public static void postorderTraverse(BitNode root) {
		Stack s = new Stack();
		BitNode p = root;
		// pre��������ջ�Ľڵ㣬�����ж��Ƿ���p�ڵ���Һ��ӣ�����ǵĻ����Ϳ��Է���p�ڵ�
		BitNode pre = p;
		// flag����ǳ�ջ���Ǽ��������ӽ�ջ
		boolean flag = true;
		while (p != null || !s.isEmpty()) {
			if (p != null && flag) {
				s.push(p);
				p = p.lchild;
			} else {
				if (s.isEmpty())
					return;
				p = (BitNode) s.peek();
				if (p.rchild != null && p.rchild != pre) {
					p = p.rchild;
					flag = true;
				} else {
					p = (BitNode) s.pop();
					visitTNode(p);
					flag = false;
					pre = p;
				}
			}
		}
	}

	// �ǵݹ�������2
	public static void postorderTraverse2(BitNode root) {
		Stack s = new Stack();
		BitNode p = root;
		// pre��������ջ�Ľڵ㣬�����ж��Ƿ���p�ڵ���Һ��ӣ�����ǵĻ����Ϳ��Է���p�ڵ�
		BitNode pre = p;
		while (p != null || !s.isEmpty()) {
			if (p != null) {
				s.push(p);
				p = p.lchild;
			} else {
				if (s.isEmpty())
					return;
				p = (BitNode) s.peek();
				if (p.rchild != null && p.rchild != pre) {
					p = p.rchild;
				} else {
					p = (BitNode) s.pop();
					visitTNode(p);
					pre = p;
					p = null;
				}
			}
		}
	}

	// ��α���
	public static void levelTraverse(BitNode root) {
		Queue<BitNode> queue = new LinkedList<BitNode>();
		queue.offer(root);// �Ӹ��ڵ������
		while (!queue.isEmpty()) {// �ڶ���Ϊ��ǰ��������
			BitNode bitNode = queue.poll();// ȡ�������׽ڵ�
			visitTNode(bitNode);
			if (bitNode.lchild != null)
				queue.offer(bitNode.lchild);// ��������
			if (bitNode.rchild != null)
				queue.offer(bitNode.rchild);// �Һ�������
		}
	}

	static boolean CanReBuild = true; // ������ʾ�Ƿ��ܹ��ع�������

	// ok�ع�������
	public static BitNode rebuildTree(int[] preOrder, int start, int[] inOrder,
			int end, int length) {
		// ������֤
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			CanReBuild = false;
			return null;
		}

		// �����������ڵ�
		int value = preOrder[start];
		BitNode root = new BitNode();
		root.data = value;

		// �ݹ���ֹ����������ֻ��һ���ڵ�
		if (length == 1)
			return root;

		// ���ݸ��ڵ�ֲ����������� ��������������
		int rootIndex = 0;
		while (rootIndex < length) {
			if (value == inOrder[end - rootIndex]) {
				break;
			}
			rootIndex++;
		}
		// �������inv������û���ҵ���pre[0]��ȵ�ֵ�������ع�������
		if (rootIndex >= length) {
			CanReBuild = false;
			return null;
		}
		// ����������������
		root.lchild = rebuildTree(preOrder, start + 1, inOrder, end - rootIndex
				- 1, length - 1 - rootIndex);
		// ����������������
		root.rchild = rebuildTree(preOrder, start + length - rootIndex,
				inOrder, end, rootIndex);

		return root;
	}

	// ��data����Ӧ���Ĳ������������������,�������-1;���������ظö��������������Ĳ��,�涨���ڵ�Ϊ��һ��
	public static int level(BitNode bitNode, int data) {
		int leftLevel, rightLevel;
		if (bitNode == null)
			return -1;
		if (data == bitNode.data)
			return 1;
		leftLevel = bitNode.lchild == null ? -1 : level(bitNode.lchild, data);
		rightLevel = bitNode.rchild == null ? -1 : level(bitNode.rchild, data);
		if (leftLevel < 0 && rightLevel < 0)
			return -1;
		return leftLevel > rightLevel ? leftLevel + 1 : rightLevel + 1;
	}

	// �������Ҷ�ӽڵ������
	public static int leafNum(BitNode tree) {
		if (tree == null)
			return 0;
		else {
			int left = leafNum(tree.lchild);
			int right = leafNum(tree.rchild);
			if (tree.lchild == null && tree.rchild == null)
				return left + right + 1;
			else
				return left + right;
		}
	}

	// ����������ڵ����
	public static int fatherNodes(BitNode tree) {
		if (tree == null || (tree.lchild == null && tree.rchild == null))
			return 0;
		else {
			int left = fatherNodes(tree.lchild);
			int right = fatherNodes(tree.rchild);
			return left + right + 1;
		}
	}

	// ��ֻ��һ�����ӽ��ĸ��ڵ����
	public static int oneChildFather(BitNode tree) {
		int left, right;
		if (tree == null || (tree.rchild == null && tree.lchild == null))
			return 0;
		else {
			left = oneChildFather(tree.lchild);
			right = oneChildFather(tree.rchild);
			if ((tree.lchild != null && tree.rchild == null)
					|| (tree.lchild == null && tree.rchild != null))
				return left + right + 1;
			else
				return left + right;/* ��1����ΪҪ���ϸ��ڵ� */
		}
	}

	// �������ֻӵ�����ӵĸ��ڵ�����
	public static int leftChildFather(BitNode tree) {
		if (tree == null)
			return 0;
		else {
			int left = leftChildFather(tree.lchild);
			int right = leftChildFather(tree.rchild);
			if ((tree.lchild != null && tree.rchild == null))
				return left + right + 1;
			else
				return left + right;
		}
	}

	// �������ֻӵ�����ӵĸ��ڵ�����
	public static int rightChildFather(BitNode tree) {
		if (tree == null)
			return 0;
		else {
			int left = leftChildFather(tree.lchild);
			int right = leftChildFather(tree.rchild);
			if ((tree.lchild == null && tree.rchild != null))
				return left + right + 1;
			else
				return left + right;
		}
	}

	// �����������ڵ�ĸ��ڵ�ĸ���
	public static int doubleChildFather(BitNode tree) {
		int left, right;
		if (tree == null)
			return 0;
		else {
			left = doubleChildFather(tree.lchild);
			right = doubleChildFather(tree.rchild);
			if (tree.lchild != null && tree.rchild != null)
				return (left + right + 1);/* ��1����ΪҪ���ϸ��ڵ� */
			else
				return (left + right);
		}
	}

	// �����е�ÿ���ڵ�ĺ��ӶԻ�λ��
	public static void exChange(BitNode tree) {
		if (tree == null)
			return;
		if (tree.lchild != null)
			exChange(tree.lchild);
		if (tree.rchild != null)
			exChange(tree.rchild);
		BitNode temp = tree.lchild;
		tree.lchild = tree.rchild;
		tree.rchild = temp;
	}

	// �ݹ������н��ĺ�
	public static int getSumByRecursion(BitNode tree) {
		if (tree == null) {
			return 0;
		} else {
			int left = getSumByRecursion(tree.lchild);
			int right = getSumByRecursion(tree.rchild);
			return tree.data + left + right;
		}
	}

}
