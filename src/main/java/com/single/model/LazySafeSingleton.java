package com.single.model;

public class LazySafeSingleton {
  private static LazySafeSingleton singleton = null;
  private LazySafeSingleton(){}

  public static synchronized LazySafeSingleton getInstance(){
    if(singleton == null){
      singleton = new LazySafeSingleton();
    }
    return singleton;
  }

}
