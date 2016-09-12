package com.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MathRound {
  public static void main(String[] args){
    String s1 = "Programming";
    String s2 = new String("Programming");
    String s3 = "Program" + "ming";
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1 == s1.intern());
    Map<String, String> map = new HashMap<String, String>();
    Set<Map.Entry<String, String>> entrySet = map.entrySet();
    while (true){}
  }
}
