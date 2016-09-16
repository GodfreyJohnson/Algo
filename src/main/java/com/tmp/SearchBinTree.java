package com.tmp;


/**
 *
 * ������������һ���ڵ�����ӽڵ�Ĺؼ���С������ڵ㣬���ӽڵ�Ĺؼ��ִ��ڻ����������ڵ�
 *
 *
 */
public class SearchBinTree {

	public static void main(String[] args) {

		BitNode root = new BitNode();
		root.data = 6;

		// int N = 100000;
		// long t0 = System.currentTimeMillis();
		// for (int i = 0; i < N; i++) {
		// int data = (int) (Math.random() * 100);
		// insert(root, data);
		// }
		//
		// long t1 = System.currentTimeMillis();
		// System.out.println("��������������:" + (t1 - t0)+" ms");
		// BitNode node = find(root, 99);
		// long t2 = System.currentTimeMillis();
		// System.out.println("find:" + (node == null ? null:node.data));
		// System.out.println("find=:" + (t2 - t1)+" ms");

		int[] arr = { 1, 3, 9, 7, 0, 4 };
		for (int i = 0; i < arr.length; i++) {
			insert(root, arr[i]);
		}
		BinTree.levelTraverse(root);
		BitNode successor = getSuccessor(root);
		System.out.println("successor:" + successor.data);
		
		
		System.out.println("delete : " + delete(root, 1));
		BinTree.levelTraverse(root);
		
		// BinTree.levelTraverse(root);
		//
		// BitNode min = getMinNode(root);
		// System.out.println("min = " + min.data);
		//
		// BitNode max = getMaxNode(root);
		// System.out.println("max = " + max.data);

	}

	// �������������
	public static void insert(BitNode root, int data) {
		BitNode node = new BitNode();
		node.data = data;
		if (root == null) {
			root = node;
		} else {
			if (data < root.data) {
				if (root.lchild == null) {
					root.lchild = node;
				} else {
					insert(root.lchild, data);
				}
			} else {
				if (root.rchild == null) {
					root.rchild = node;
				} else {
					insert(root.rchild, data);
				}
			}

		}
	}

	// ������С�ڵ�
	public static BitNode getMinNode(BitNode root) {
		BitNode current, min = null;
		current = root;
		while (current != null) {
			min = current;
			current = current.lchild;
		}
		return min;
	}

	// �������ڵ�
	public static BitNode getMaxNode(BitNode root) {
		BitNode current, max = null;
		current = root;
		while (current != null) {
			max = current;
			current = current.rchild;
		}
		return max;
	}

	// ����
	public static BitNode find(BitNode root, int data) {
		BitNode current = root;
		while (current.data != data) {
			if (data < current.data)
				current = current.lchild;
			else
				current = current.rchild;
			if (current == null)
				return null;
		}
		return current;
	}

	// �õ���Ҫ��ɾ���Ľڵ�ĺ��(�������)
	public static BitNode getSuccessor(BitNode delNode) {
		BitNode successorParent = delNode;
		BitNode successor = delNode;
		BitNode current = delNode.rchild;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.lchild;
		}

		if (successor != delNode.rchild) {
			successorParent.lchild = successor.rchild;
			successor.rchild = delNode.rchild;
		}
		return successor;
	}

	// ɾ��һ���ڵ�----?ɾ�����ڵ�ʱ����ִ���
	public static boolean delete(BitNode root, int data) {
		BitNode current = root;
		BitNode parent = root;
		boolean isLeftChild = true;

		while (current.data != data) {// search for node
			parent = current;
			if (data < current.data) { // go left?
				isLeftChild = true;
				current = current.lchild;
			} else { // go right?
				isLeftChild = false;
				current = current.rchild;
			}

			if (current == null) { // end of th
				return false; // didn't find it
			}
		}

		// found node to delete

		// if no children, simply delete it
		if (current.lchild == null && current.rchild == null) {
			if (current == root) {// if root
				root = null; // tree is empty
			} else if (isLeftChild) {
				parent.lchild = null;// disconnect
			} else { // from parent
				parent.rchild = null;
			}
		} else if (current.rchild == null) {// if no right child replace with
											// left subtree
			if (current == root) {
				root = current.lchild;
			} else if (isLeftChild) {
				parent.rchild = current.lchild;
			} else {
				parent.rchild = current.lchild;
			}
		} else if (current.lchild == null) {// if no left child replace with
											// right subtree
			if (current == root) {
				root = current.rchild;
			} else if (isLeftChild) {
				parent.lchild = current.rchild;
			} else {
				parent.rchild = current.rchild;
			}
		} else {// two chiledren ,so replace with inorde successor
			//get successor of node to delete(current)
			BitNode successor = getSuccessor(current);
			//connect parent of current to successor instead
			if(current == root){
				root = successor;
			} else if(isLeftChild){
				parent.lchild = successor;
			} else {
				parent.rchild = successor;
			}
			
			//connect successor to current's left child
			successor.lchild = current.lchild;
		}

		return true;
	}

}










