package com.common;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("godfrey", 22 + "");
    map.put("gloria", 23 + "");map.put("17", 22 + "");
    map.put("1", 23 + "");map.put("16", 22 + "");
    map.put("2", 23 + "");map.put("15", 22 + "");
    map.put("3", 23 + "");map.put("14", 22 + "");
    map.put("4", 23 + "");map.put("13", 22 + "");
    map.put("5", 23 + "");map.put("12", 22 + "");
    map.put("6", 23 + "");map.put("11", 22 + "");
    map.put("7", 23 + "");map.put("9", 22 + "");
    map.put("8", 23 + "");

    Iterator it1 = map.entrySet().iterator();
    while (it1.hasNext()) {
      Map.Entry entry = (Map.Entry) it1.next();
      String key = (String) entry.getKey();
      String value = (String) entry.getValue();
      System.out.println(key + "-" + value);
    }

    Iterator it2 = map.keySet().iterator();
    while (it2.hasNext()){
      String key = (String) it2.next();
      String value = map.get(key);
      System.out.println(key + "-" + value);
    }

    map.containsKey("godfrey");
    map.remove("godfrey");
    map.containsKey("godfrey");
    map.clear();


    Map<String, String> table = new Hashtable<String, String>();
//    table.p
  }
}
