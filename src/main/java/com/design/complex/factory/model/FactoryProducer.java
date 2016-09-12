package com.design.complex.factory.model;

public class FactoryProducer {
  public static final int FOOD = 1;
  public static final int CLEAN = 2;

  public AbstractFactory getFactory(int type) {
    AbstractFactory result = null;
    switch (type) {
      case FOOD:
        result = new FoodFactory();
        break;
      case CLEAN:
        result = new CleanFactory();
        break;
    }
    return result;
  }
}
