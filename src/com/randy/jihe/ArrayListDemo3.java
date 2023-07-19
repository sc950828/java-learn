package com.randy.jihe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author randy
 * @date 2023/4/23 16:22
 */
public class ArrayListDemo3 {
  public static void main(String[] args) {
    // 边遍历 边删除
    ArrayList<Integer> list = new ArrayList();
    list.add(98);
    list.add(77);
    list.add(66);
    list.add(89);
    list.add(79);
    list.add(50);
    list.add(100);

    // for循环
//    for (int i = 0; i < list.size(); i++) {
//      int score = list.get(i);
//      if( score < 80) {
//        list.remove(i);
//      }
//    }

    // for循环 可以解决
//    for (int i = 0; i < list.size(); i++) {
//      int score = list.get(i);
//      if( score < 80) {
//        list.remove(i);
//        i--;
//      }
//    }

    // 倒着for循环也可以解决
//    for (int i = list.size()-1; i >= 0 ; i--) {
//      if( list.get(i) < 80) {
//        list.remove(i);
//      }
//      System.out.println(list.get(i));
//    }

    // 迭代器
//    Iterator<Integer> it = list.iterator();
//    while(it.hasNext()) {
//      int value = it.next();
//      if(value < 80) {
//        it.remove(); // 使用迭代器的删除
//      }
//      System.out.println(value);
//    }

    // forEach 会报错
//    list.forEach(s -> {
//      if(s < 80) {
//        list.remove(s);
//      }
//      System.out.println(s);
//    });

    // 增强for循环 会报错
//    for (int i : list) {
//      if(i < 80) {
//        list.remove(i);
//      }
//      System.out.println(i);
//    }
    System.out.println(list);
  }
}
