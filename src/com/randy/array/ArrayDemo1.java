package com.randy.array;

/**
 * @author randy
 * @date 2023/4/21 14:45
 */
public class ArrayDemo1 {
  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
  }

  public static void test1() {
   int[] arr = new int[]{1, 2, 3};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void test2() {
    // 简写形式
    int[] arr = {1, 2, 3};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void test3() {
    String[] str = new String[]{"randy", "demi"};

    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }
  public static void test4() {
    // 只是不建议这么写
    String str[] = {"randy", "demi"};

    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }

    // 能遍历数组
    for (String s : str) {
      System.out.println("增强for循环" + s);
    }
  }

  public static void test5() {
    String[] str = new String[10];
    str[0] = "Jack";

    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }

}
