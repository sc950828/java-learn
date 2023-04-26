package com.randy.function;

/**
 * @author randy
 * @date 2023/4/21 17:08
 */
public class FuncDemo1 {
  public static void main(String[] args) {
    int a = 1;
    test1(a);
    System.out.println(a);

    String str = "randy";
    test2(str);
    System.out.println(str); // randy

    int[] arr = {12,14};
    test3(arr);
    System.out.println(arr[1]);
  }

  public static void test1(int a) {
    a = 10;
    System.out.println(a);
  }

  public static void test2(String str) {
    str = "demi";
    System.out.println(str); // demi
  }

  public static void test3(int[] arr) {
    arr[1] = 88;
    System.out.println(arr[1]);
  }
}
