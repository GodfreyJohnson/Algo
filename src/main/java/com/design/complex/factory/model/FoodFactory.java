package com.design.complex.factory.model;

import static com.design.complex.factory.model.Food.BREAD;
import static com.design.complex.factory.model.Food.HOTDOG;

public class FoodFactory extends AbstractFactory {
  Food food = null;

  public void getCook(int type) {
    switch (type) {
      case BREAD:
        food = new Bread();
        food.cook();
        break;
      case HOTDOG:
        food = new HotDog();
        food.cook();
        break;
      default:
        break;
    }
  }

  public void getClean(int type) {
  }
}
