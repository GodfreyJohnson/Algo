package com.offer;

import com.common.ComplexListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * pay more attention to the null pointer when reach to the end of the linked list
 * and also notice the next.next, sibling.next should check null
 */
public class TestCloneComplexListNode26 {
  CloneComplexListNode26 node;

  @Before
  public void before() {
    node = new CloneComplexListNode26();
  }

  @Test
  public void run() {
    ComplexListNode a = new ComplexListNode(1);
    ComplexListNode b = new ComplexListNode(2);
    ComplexListNode c = new ComplexListNode(3);
    a.next = b;
    a.sibling = c;
    b.next = c;
    Assert.assertEquals(node.solution(a), a.val);
  }

  @Test
  public void run2() {
    ComplexListNode a = null;
    ComplexListNode b = new ComplexListNode(2);
    ComplexListNode c = new ComplexListNode(3);
//    a.next = b;
//    a.sibling = c;
    b.next = c;
    Assert.assertEquals(node.solution(a), 0);
  }
}
