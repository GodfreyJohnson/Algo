package com.offer;

import java.util.List;
import java.util.Stack;

public class StackPopOrder22 {
  public boolean solution(List<Integer> list, List<Integer> model) {
    if (list == null || list.size() <= 0 || model == null || model.size() != list.size())
      return false;

    Stack<Integer> stack = new Stack<Integer>();
    int index = 0;
    for (int output : model) {
      if (stack.size() > 0 && stack.peek() == output) {
        // check the peek of the stack firstly
        System.out.println(stack.peek());
        stack.pop();
      } else if (index < list.size()){
        // not found in the peek of the stack, then push new element util find it
        while (index < list.size()) {
          int input = list.get(index);
          if (input != output) {
            stack.push(input);
            index++;
          } else {
            stack.push(input);
            System.out.println(stack.peek());
            stack.pop();
            index++;
            break;
          }
        }
      } else {
        // can not find the element in the rest element, means the order is wrong
        // the pushed element in stack will only pop with one order
        return false;
      }
    }
    return true;
  }
}
