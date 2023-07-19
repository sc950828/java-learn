package com.randy.jihe;

import java.util.*;

/**
 * @author randy
 * @date 2023/5/18 15:23
 * 集合嵌套
 */
public class QianTao {
  public static void main(String[] args) {
    Map<String, List<String>> map1 = new HashMap<>();

    List<String> list1 = new ArrayList<String>();
    Collections.addAll(list1,"A", "B");
    map1.put("randy", list1);

    List<String> list2 = new ArrayList<String>();
    Collections.addAll(list2,"A", "B" , "C");
    map1.put("demi", list2);

    List<String> list3 = new ArrayList<String>();
    Collections.addAll(list3, "B" , "C");
    map1.put("jack", list3);

    System.out.println(map1);


    Map<String, Integer> infos = new HashMap<>();
    Collection<List<String>> lists = map1.values();
    lists.forEach(list -> {
      list.forEach(item -> {
        if(infos.containsKey(item)) {
          infos.put(item, infos.get(item) + 1);
        } else {
          infos.put(item, 1);
        }
      });
    });

    System.out.println(infos);

  }
}
