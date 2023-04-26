package com.randy.daimakuai;

/**
 * @author randy
 * @date 2023/4/24 13:26
 */
public class DaiMaKuai1 {
  public static void main(String[] args) {
    System.out.println("静态方法");
    DaiMaKuai1 dk = new DaiMaKuai1();
  }

  // 静态代码块优先静态方法执行
  static {
    System.out.println("静态代码块");
  }

  // 构造代码块，在使用构造器创建对象的时候才会调用，并且优先于构造器执行
  {
    System.out.println("实例代码块");
  }

  public DaiMaKuai1() {
    System.out.println("构造方法");
  }
}
