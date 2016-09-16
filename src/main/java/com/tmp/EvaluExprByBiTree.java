package com.tmp;

class TreeNode {
	String data;
	TreeNode lchild;
	TreeNode rchild;
	static int counter;

	public static TreeNode createBiTree(TreeNode root, String[] a, int i) {
		if (i < a.length) {
			if (a[i].equals("#")) {
				root = null;
			} else {
				TreeNode lchild = new TreeNode();
				TreeNode rchild = new TreeNode();
				// root.setNode(a[i], createBiTree2(lchild, a, ++counter),
				// createBiTree2(rchild, a, ++counter));
				root.data = a[i];
				root.lchild = createBiTree(lchild, a, ++counter);
				root.rchild = createBiTree(rchild, a, ++counter);
			}
		}
		return root;
	}

	
	// �ݹ�������
	public static void PostOrderTraverse(BitNode root, String rpn) {
		if (root != null) {
			PostOrderTraverse(root.lchild, rpn);
			PostOrderTraverse(root.rchild, rpn);
			rpn += root.data + " ";
		}
	}
}

/**
 * ���ö������ѱ��ʽת�����沨�����ʽ����ֵ
 * 
 * @author Administrator
 *
 */
public class EvaluExprByBiTree {

	public static void main(String[] args) {
		String exp = "1.5 + 22 * ( 4 + 1 ) / 2 #";
		float result = evaluateExpression(exp);
	}

	private static float evaluateExpression(String exp) {

		return 0;
	}

	// ����ʽת��Ϊ�沨�����ʽ(��׺���ʽ)
	public static String[] convertToRPN(String exp) {
		String[] rpn = null;
		
		return rpn;
	}

	// ���ַ��͵�����ת����Float��
	public static float ReadNum(String s) {
		try {
			return Float.valueOf(s);
		} catch (Exception e) {
			return 0f;
		}
	}// ReadNum

	public static String Precede(String a, String b) {
		int i, j;
		String[][] Table = { { " ", "+", "-", "*", "/", "(", ")", "#" },
				{ "+", ">", ">", "<", "<", "<", ">", ">" },
				{ "-", ">", ">", "<", "<", "<", ">", ">" },
				{ "*", ">", ">", ">", ">", "<", ">", ">" },
				{ "/", ">", ">", ">", ">", "<", ">", ">" },
				{ "(", "<", "<", "<", "<", "<", "=", " " },
				{ ")", ">", ">", ">", ">", " ", ">", ">" },
				{ "#", "<", "<", "<", "<", "<", " ", "=" } };

		for (i = 0; i < 8; i++)
			if (Table[0][i].equals(a)) // ������Ѱ��
				break;
		for (j = 0; j < 8; j++)
			// ������Ѱ��
			if (Table[j][0].equals(b))
				break;
		return Table[j][i];
	}// Precede

	/**
	 * ����
	 * 
	 * @param a
	 * @param theta
	 * @param b
	 * @return
	 */
	public static float Operate(float a, String theta, float b) // ������ʽֵ����Ҫ�ǽ���ı��ʽ
	{ // ת����С�ı��ʽ��������ֵ
		float c;
		if (theta.equals("+"))
			c = a + b;
		else if (theta.equals("-"))
			c = a - b;
		else if (theta.equals("*"))
			c = a * b;
		else
			c = a / b;
		return c;
	}// Operate
}
