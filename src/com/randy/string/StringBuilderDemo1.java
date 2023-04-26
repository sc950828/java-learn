package com.randy.string;

/**
 * @author randy
 * @date 2023/4/26 13:38
 */
public class StringBuilderDemo1 {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Randy");
    sb1.append(" Hello");

    System.out.println(sb1);
    System.out.println(sb1.reverse());
    System.out.println(sb1.length());
    System.out.println(sb1.toString() instanceof String);
  }
}
