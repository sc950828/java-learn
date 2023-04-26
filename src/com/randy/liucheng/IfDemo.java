package com.randy.liucheng;

/**
 * @author randy
 * @date 2023/4/21 13:25
 */
public class IfDemo {
  public static void main(String[] args) {
    test1(1);
  }

  public static void test1(int num) {
    if(num > 10) {
      System.out.println(num + "大于10");
    } else if(num > 0) {
      System.out.println(num + "大于0");
    } else {
      System.out.println(num );
    }
  }
}
