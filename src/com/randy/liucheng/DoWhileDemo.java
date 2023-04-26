package com.randy.liucheng;

/**
 * @author randy
 * @date 2023/4/21 14:31
 */
public class DoWhileDemo {
  public static void main(String[] args) {
    test1();
  }

  public static void test1() {
    // 先执行再判断
    int i = 10;
    do{
      System.out.println(i);
      i--;
    } while(i>10);
  }
}
