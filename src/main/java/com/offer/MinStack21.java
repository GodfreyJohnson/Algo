package com.offer;

import java.util.Stack;

public class MinStack21 {
  private Stack<Integer> stack = new Stack<Integer>();
  private Stack<Integer> minStack = new Stack<Integer>();

  public void push(int i) {
    stack.push(i);
    if (minStack == null || minStack.size() == 0)
      minStack.push(i);
    else {
      int peek = minStack.peek();
      int min = peek > i ? i : peek;
      minStack.push(min);
    }
  }

  // pop don't need return value
  public void pop() {
    if (stack != null && stack.size() > 0) {
      minStack.pop();
      stack.pop();
    }
    return;
  }

  public int min() {
    if (minStack != null && minStack.size() > 0) {
      return minStack.peek();
    } else {
      return -1;
    }
  }
}
