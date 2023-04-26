package com.randy.liucheng;

/**
 * @author randy
 * @date 2023/4/21 13:28
 */
public class SwitchDemo {
  public static void main(String[] args) {
    test1('A');
    test1('B');
    test1('C');
  }

  public static void test1(char str) {
    switch (str) {
      case 'A':
        System.out.println('a');
        // break;
        return;
      case 'B':
        System.out.println('b');
        break;
      default:
        System.out.println("default");
    }
  }
}
