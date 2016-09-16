package com.offer;

public class IntegerPow11 {
  public double solution(double base, int ex) {
    if (equalZero(base, 0.0)) {
      return 0.0;
    }

    double result = 0.0;
    int abs = ex;
    if (ex < 0)
      abs = -ex;

    result = cusPow(base, abs);

    if (ex < 0)
      result = 1 / result;

    return result;
  }

  private double cusPow(double base, int ex) {
    if (ex == 0)
      return 1;
    if (ex == 1)
      return base;

    double result = cusPow(base, ex >> 1);
    result = result * result;

    return result;
  }

  private boolean equalZero(double base, double value) {
    if (base - value > -0.0000001 && base - value < 0.0000001) {
      return true;
    }
    return false;
  }
}
