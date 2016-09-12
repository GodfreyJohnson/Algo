package com.design.complex.factory.model;

import static com.design.complex.factory.model.FactoryProducer.CLEAN;
import static com.design.complex.factory.model.FactoryProducer.FOOD;

public class Shop {
  public static void main(String[] args){
    FactoryProducer fp = new FactoryProducer();
    AbstractFactory factory = fp.getFactory(FOOD);
    factory.getCook(1);
    factory.getCook(2);
    factory = fp.getFactory(CLEAN);
    factory.getClean(1);
    factory.getClean(2);
  }
}
