package com.common;

public class TestClassLoader {
  public static void main(String[] args) {
    TestClassLoader test = new TestClassLoader();
  }

  public TestClassLoader() {
    try {
      Class tmp = this.getClass().getClassLoader().loadClass("TreeNode");
      Class tmp2 = Class.forName("TreeNode");
      Class tmp3 = TreeNode.class;
      System.out.print(tmp.toString());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
