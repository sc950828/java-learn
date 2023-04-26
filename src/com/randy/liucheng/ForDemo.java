package com.randy.liucheng;

/**
 * @author randy
 * @date 2023/4/21 14:20
 */
public class ForDemo {
  public static void main(String[] args) {
    test1();
    test2();
  }

  public static void test1() {
    for (int i = 0; i <= 10; i++) {
      if(i==5) {
        // break;
        continue;
      }
      System.out.println(i);
    }
  }

  public static void test2() {
    for (int i = 0; i <= 10; i++) {
      if(i==5) {
         break;
        //continue;
        // return; // 退出循环
      }
      System.out.println(i);
    }
    System.out.println("return 我就不执行啦，break我会执行");
  }
}
