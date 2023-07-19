package com.randy.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

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

    // 清空
    // list.clear();
    // System.out.println(list);
    // System.out.println(list.isEmpty());

    System.out.println(list.contains("JS"));
    System.out.println(list.size());
    // 删除
    System.out.println(list.remove("Java"));
    System.out.println(list);

    // 转数组
    Object[] arr = list.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // 泛型
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    System.out.println(list2);

    // 合并
    // list.addAll(list2);
    // System.out.println(list);
    // System.out.println(list2);

    // 迭代器遍历
    Iterator<String> it = list.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }

    // 增强for循环
    for (int i : list2) {
      System.out.println(i);
    }

    // forEach
    list2.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println("forEach" + integer);
      }
    });

    // lambda
    list2.forEach(integer -> {
      System.out.println("Lambda forEach" + integer);
    });

  }
}
