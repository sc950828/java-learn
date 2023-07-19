package com.randy.exception;

/**
 * @author randy
 * @date 2023/5/24 16:12
 */
public class Test1 {
  public static void main(String[] args) {
    try {
      Integer i = 12;
      System.out.println(i / 0);
    } catch (Exception e) {
      System.out.println("出异常了");
      e.printStackTrace();
    }

    System.out.println("异常被捕获了，出异常了我也能执行了");
  }
}
