package com.offer;

import com.common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFirstCommonNodesInLists37 {
  FirstCommonNodesInLists37 common;

  @Before
  public void before() {
    common = new FirstCommonNodesInLists37();
  }

  @Test
  public void run() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    ListNode f = new ListNode(6);
    ListNode g = new ListNode(7);
    a.next = b;
    b.next = c;
    c.next = f;
    f.next = g;
    d.next = e;
    e.next = f;
    Assert.assertEquals(common.solution(a, d), 6);
  }

  @Test
  public void run2() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = null;
    ListNode e = new ListNode(5);
    ListNode f = new ListNode(6);
    ListNode g = new ListNode(7);
    a.next = b;
    b.next = c;
    c.next = f;
    f.next = g;
    Assert.assertEquals(common.solution(a, d), 0);
  }

  @Test
  public void run3() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    ListNode f = new ListNode(6);
    ListNode g = new ListNode(7);
    ListNode h = new ListNode(8);
    a.next = b;
    b.next = c;
    c.next = f;
    f.next = g;
    h.next = d;
    d.next = e;
    e.next = f;
    Assert.assertEquals(common.solution(a, h), 6);
  }

  @Test
  public void run4() {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    ListNode f = new ListNode(6);
    ListNode g = new ListNode(7);
    a.next = b;
    b.next = c;
    c.next = f;
    f.next = g;
    e.next = f;
    Assert.assertEquals(common.solution(a, f), 6);
  }


}
