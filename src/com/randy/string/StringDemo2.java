package com.randy.string;

/**
 * @author randy
 * @date 2023/4/23 15:55
 */
public class StringDemo2 {
  public static void main(String[] args) {
    String str = "Randy";

    System.out.println(str.length());
    System.out.println(str.charAt(1));
    System.out.println(str.toCharArray());
    System.out.println(str.substring(1,3));
    System.out.println(str.split(""));
  }
}
