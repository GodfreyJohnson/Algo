package com.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by godfrey on 16-9-14.
 */
public class DeleteNumFromString {

  public String solution(String str) {
    if (str == null || str.equals("")) {
      return str;
    }

//    str = str.replace("0", "");
//    str = str.replace("1", "");
//    str = str.replace("2", "");
//    str = str.replace("3", "");
//    str = str.replace("4", "");
//    str = str.replace("5", "");
//    str = str.replace("6", "");
//    str = str.replace("7", "");
//    str = str.replace("8", "");
//    str = str.replace("9", "");


    str = str.replaceAll("(\\d)","");

    System.out.println("result: " + str);
    return str;
  }
}
