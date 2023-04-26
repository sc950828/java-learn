package com.randy.bigdecimal;

import java.math.BigDecimal;

/**
 * @author randy
 * @date 2023/4/26 14:01
 */
public class BigDecimalDemo1 {
  public static void main(String[] args) {
    BigDecimal b1 = BigDecimal.valueOf(0.1);
    BigDecimal b2 = BigDecimal.valueOf(0.2);

    BigDecimal c1 = b1.add(b2);

    System.out.println(c1);
    System.out.println(c1 instanceof BigDecimal);

    double d1 = c1.doubleValue();
    System.out.println(d1);
  }
}
