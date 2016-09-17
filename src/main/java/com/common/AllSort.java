package com.common;

/**
 * http://www.cnblogs.com/lifegoesonitself/p/3225803.html
 */
public class AllSort {
  public static void main(String[] args){
    AllSort as = new AllSort();
    as.permutation1("abc", "", "abc".length());
  }
  public void permutation1(String str ,String result ,int len){
    if(str == null || str.equals(""))
      return;

    if(result.length() == len){
      System.out.println(result);
    }

    for(int i = 0; i < len; i++) {
      if(result.indexOf(str.charAt(i)) < 0) {
        permutation1(str, result + str.charAt(i), len);
      }
    }
  }
}
