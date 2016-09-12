package com.common;

public class AllComposition {
  public static void main(String[] args) {
    AllComposition ac = new AllComposition();
    String[] arr = {"a", "b", "c"};
    ac.composition(arr);
  }

  private void composition(String[] arr){
    if(arr == null || arr.length <= 0)
      return;

    int len = arr.length;
    int bit = 1 << len;
    for(int i = 0; i < bit; i++) {
      StringBuilder sb = new StringBuilder();
      for(int j = 0; j < len; j++) {
        if((i & (1 << j)) != 0) {
          sb.append(arr[j]);
        }
      }
      System.out.println(sb.toString());
    }
  }
}
