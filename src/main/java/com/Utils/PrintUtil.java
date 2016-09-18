package com.Utils;

import com.common.ListNode;

public class PrintUtil {
  public static void printIntArray(int[] nums){
    System.out.println("Start to print array: ");
    for(int num: nums){
      System.out.println(num);
    }
    System.out.println("End to print array!");
  }

  public static void printLinkedList(ListNode head){
    if(head != null) {
      System.out.println("Start to print linked list: ");
      while(head != null){
        System.out.println(head.val);
        head = head.next;
      }
      System.out.println("End to print linked list! ");
    }
  }
}
