package com.common;

public class AllSort {
  public static void main(String[] args){
    AllSort as = new AllSort();
    as.permutation1("abc", "", 3);
  }
  public void permutation1(String str ,String result ,int len){
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
