package com.randy.jiekou;

/**
 * @author randy
 * @date 2023/4/25 15:25
 */
public interface InterfaceDemo1 {
  String SCHOOL = "上海";

  void say();

  default void hello() {
    System.out.println("hello");
    wa();
  }

  static void hi() {
    System.out.println("静态方法");
  }

  private void wa() {
    System.out.println("私有方法");
  }
}
