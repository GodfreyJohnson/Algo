package com.design.simple.factory.model;

public class BreadSimpleFactory {
  public static final int BREAD = 1;
  public static final int HOTDOG = 2;

  public static void main(String[] args) {
    BreadSimpleFactory bsf = new BreadSimpleFactory();
    bsf.sell(BREAD);
    bsf.sell(HOTDOG);
  }

  private void sell(int type) {
    Cooker cooker = null;
    switch (type) {
      case BREAD:
        cooker = new Bread();
        cooker.cook();
        break;
      case HOTDOG:
        cooker = new HotDog();
        cooker.cook();
        break;
    }
  }
}
