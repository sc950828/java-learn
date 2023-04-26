package com.randy.jicheng;

/**
 * @author randy
 * @date 2023/4/24 16:47
 */
public class JiCheng2 {
  public static void main(String[] args) {

    Father2 s1 = new Father2("Randy");
    System.out.println(s1.getName());
    System.out.println(s1.getSex());
  }

}

class Father2 {
  private String name;
  public String sex = "父类男";
  public static int age = 10;

  public Father2() {
    System.out.println("父类构造器");
  }

  public Father2(String name) {
    // 调用自身构造器
    this(name, "女孩");
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Father2(String name, String sex) {
    this.name = name;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
