package com.randy.chouxaing;

/**
 * @author randy
 * @date 2023/4/25 15:10
 */
public abstract class AbstractDemo1 {
  abstract void say();

  public static void main(String[] args) {
    Son s = new Son();
    s.say();
  }
}

class Son extends AbstractDemo1 {
  @Override
  void say() {
    System.out.println("子类say");
  }
}