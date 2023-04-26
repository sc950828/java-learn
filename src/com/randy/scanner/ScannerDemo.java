package com.randy.scanner;

import java.util.Scanner;

/**
 * @author randy
 * @date 2023/4/21 11:31
 */
public class ScannerDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入您的姓名：");
    String name = scanner.next();
    System.out.println("您的姓名是：" + name);

    System.out.println("请输入您的年龄：");
    int age = scanner.nextInt();
    System.out.println("您的年龄是：" + age);
  }
}
