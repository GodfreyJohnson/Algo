package com.common;

public class NumberOfOneBit {
  public static void main(String[] args){
    NumberOfOneBit numberOfOneBit = new NumberOfOneBit();
     numberOfOneBit.hammingWeight(2147483647);
  }
  public int hammingWeight(int n) {
    if(n <=0)
      return 0;
    int count = 0;
    while(n != 0){
      if((n & 1) == 1)
        count ++;
      n = n>>1;
    }
    return count;
  }
}
