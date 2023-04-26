package com.randy.jihe;

import java.util.ArrayList;

/**
 * @author randy
 * @date 2023/4/23 16:22
 */
public class ArrayListDemo3 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();
    list.add(98);
    list.add(77);
    list.add(66);
    list.add(89);
    list.add(79);
    list.add(50);
    list.add(100);

//    for (int i = 0; i < list.size(); i++) {
//      int score = list.get(i);
//      if( score < 80) {
//        list.remove(i);
//      }
//    }

    for (int i = 0; i < list.size(); i++) {
      int score = list.get(i);
      if( score < 80) {
        list.remove(i);
        i--;
      }
    }

    System.out.println(list);
  }
}
