package com.randy.duotai;

import java.sql.SQLOutput;

/**
 * @author randy
 * @date 2023/4/25 17:19
 */
public class DuoTaiDemo1 {
  public static void main(String[] args) {
    Father s1 = new Son1();
    s1.say();
    System.out.println(s1.name);

    Father s2 = new Son2();
    s2.say();
    System.out.println(s2.name);
  }
}

abstract class  Father {
  public String name = "father";

  abstract void say();
}

class Son1 extends Father{
  public String name = "son1";

  @Override
  void say() {
    System.out.println("Son1");
  }
}

class Son2 extends Father{
  public String name = "son2";

  @Override
  void say() {
    System.out.println("Son2");
  }
}
