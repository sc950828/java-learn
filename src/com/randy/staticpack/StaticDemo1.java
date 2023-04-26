package com.randy.staticpack;

/**
 * @author randy
 * @date 2023/4/24 11:18
 */
public class StaticDemo1 {

  private static int num = 12;
  private String name = "Randy";

  public static void main(String[] args) {
    //System.out.println(num);
    //say();

    StaticDemo1 sd = new StaticDemo1();
    //System.out.println(sd.num);
    //sd.say();
    sd.hello();


  }

  public static void say() {
    System.out.println("哈哈");
    // hello();
  }

  public void hello() {
    say(); // 普通方法能调用静态方法
    System.out.println(num);// 普通方法能调用静态属性
    System.out.println("hello");
    System.out.println(name);

  }
}
