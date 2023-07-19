package com.randy.fanxing;

/**
 * @author randy
 * @date 2023/5/17 9:32
 */
public class FanXing1 {
  public static void main(String[] args) {
    FanXing1 fx1 = new FanXing1();
    System.out.println(fx1.test1("randy"));
    System.out.println(fx1.test1(27));
  }

  public <T> T test1(T t) {
    return t;
  }
}
