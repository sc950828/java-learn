package com.randy.lambda;

/**
 * @author randy
 * @date 2023/4/26 15:07
 */
public class LambdaDemo {

  public static void main(String[] args) {
    Animal a1 = new Animal() {
      @Override
      public void say(String str) {
        System.out.println("say hello1" + str);
      }
    };

    // lambda表达式
    Animal a2 = (str) -> {
      System.out.println("say hello2" + str);
    };

    a1.say("Randy");
    a2.say("Demi");

    // 简写
    Animal a3 = str -> System.out.println("hello " + str);
    a3.say("Jack");
  }
}

// 通常会加上该注解 但不是必须的
@FunctionalInterface
interface Animal {
  void say(String name);
}
