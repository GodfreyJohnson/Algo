package com.offer;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMergeTwoSortedLinkedList17 {
  MergeTwoSortedLinkedList17 merge;

  @Before
  public void before() {
    merge = new MergeTwoSortedLinkedList17();
  }

  @Test
  public void run() {
    ListNode a = new ListNode(1);
    ListNode b = null;
    Assert.assertEquals(merge.solution(a, b), a);
  }

  @Test
  public void run2() {
    ListNode a = new ListNode(2);
    ListNode b = new ListNode(3);
    a.next = b;
    ListNode c = new ListNode(1);
    ListNode d = new ListNode(4);
    c.next = d;

    Assert.assertEquals(merge.solution(a, c), c);
  }

  @Test
  public void run3() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    a.next = b;
    b.next = c;
    ListNode d = new ListNode(4);

    Assert.assertEquals(merge.solution(a, d), a);
  }

  @Test
  public void run4() {
    ListNode a = new ListNode(1);
    ListNode b = null;
    Assert.assertEquals(merge.solution2(a, b), a);
  }

  @Test
  public void run5() {
    ListNode a = new ListNode(2);
    ListNode b = new ListNode(3);
    a.next = b;
    ListNode c = new ListNode(1);
    ListNode d = new ListNode(4);
    c.next = d;

    Assert.assertEquals(merge.solution2(a, c), c);
  }

  @Test
  public void run6() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    a.next = b;
    b.next = c;
    ListNode d = new ListNode(4);

    Assert.assertEquals(merge.solution2(a, d), a);
  }
}
