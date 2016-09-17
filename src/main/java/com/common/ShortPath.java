package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortPath {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = Integer.parseInt(sc.next());
    int count = 0;
    int[][] country = new int[target][target];
    while (count < target) {
      String[] array = sc.next().split(",");
      if (args.length != target) {
        return;
      }
      for (int i = 0; i < target; i++) {
        country[count][i] = Integer.parseInt(array[i]);
      }
      count++;
    }
    ShortPath sp = new ShortPath();
    List<Integer> existCountry = new ArrayList<Integer>();
    existCountry.add(0);
    sp.findShortestPath(country, target, existCountry, 0);
  }

  private void findShortestPath(int[][] country, int target, List<Integer> existCountry, int cur) {
    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    if(existCountry.size() == target){
      printAll(existCountry, country);
      return;
    }
    for (int i = 0; i < target; i++) {
      if (country[cur][i] < min && existCountry.contains(country[cur][i]) && cur != i) {
        minIndex = i;
        min = country[cur][i];
      }
    }
    existCountry.add((minIndex));
    findShortestPath(country, target, existCountry, minIndex);
  }

  private void printAll(List<Integer> existCountry, int[][] country) {
    if(existCountry == null || existCountry.size() <= 0)
      return;
    int result = 0;
    for(int i = 0; i< existCountry.size()-1;i++) {
      int index = existCountry.get(i);
      int index2 = existCountry.get(i+1);
      result += country[index][index2];
    }
    System.out.print(result);
  }
}
