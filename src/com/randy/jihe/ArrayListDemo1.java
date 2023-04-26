package com.randy.jihe;

import java.util.ArrayList;

/**
 * @author randy
 * @date 2023/4/23 16:01
 */
public class ArrayListDemo1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("Randy");
    list.add("JS");
    list.add("JS");
    list.add("Java");
    list.add(2,"Python");

    System.out.println(list);

    // 泛型
    ArrayList<Integer> list2 = new ArrayList<>();

    list2.add(1);
    System.out.println(list2);

  }
}
