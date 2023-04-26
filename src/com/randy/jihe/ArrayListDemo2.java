package com.randy.jihe;

import java.util.ArrayList;

/**
 * @author randy
 * @date 2023/4/23 16:13
 */
public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("Randy");
    list.add("Java");
    list.add("Js");

    list.set(2, "Py");

    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.get(2));

    // 遍历
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println(list.remove(2));
    System.out.println(list.remove("Java"));
  }
}
