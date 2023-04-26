package com.randy.jicheng;

/**
 * @author randy
 * @date 2023/4/24 16:47
 */
public class JiCheng1 {
  public static void main(String[] args) {
//    Son s = new Son();
//    System.out.println(s.getName());
//    s.say();

    Son s1 = new Son("Randy");
    System.out.println(s1.getName());
    System.out.println(s1.getSex());
  }

}

class Father {
  private String name;
  public static int age = 10;
  public String sex = "父类男";

  public Father() {
    System.out.println("父类构造器");
  }

  public Father(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Son extends Father{

  private String sex = "子类男";

  public Son() {
    // 默认会调用父类无参构造器
    System.out.println("子类构造器");
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void say() {
    String sex = "局部男";
    System.out.println(sex);
    System.out.println(super.sex);
  }

  public Son(String name) {
    // 显示调用父类构造器
    super(name);
  }
}