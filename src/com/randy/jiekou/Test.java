package com.randy.jiekou;

/**
 * @author randy
 * @date 2023/4/25 15:32
 */
public class Test implements InterfaceDemo1{

  public static void main(String[] args) {
    Test t = new Test();
    t.say();
    t.hello();
    InterfaceDemo1.hi();
  }
  @Override
  public void say() {
    System.out.println("拉拉");
  }
}
