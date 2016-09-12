package com.design.complex.factory.model;

import static com.design.complex.factory.model.Clean.DISH;
import static com.design.complex.factory.model.Clean.FLOOR;

public class CleanFactory extends AbstractFactory {
  Clean clean = null;

  public void getCook(int type) {

  }

  public void getClean(int type) {
    switch (type) {
      case DISH:
        clean = new Dish();
        clean.wash();
        break;
      case FLOOR:
        clean = new Tool();
        clean.wash();
        break;
      default:
        break;
    }
  }
}
