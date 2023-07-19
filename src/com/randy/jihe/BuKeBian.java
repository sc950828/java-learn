package com.randy.jihe;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author randy
 * @date 2023/5/18 15:40
 * 不可变集合
 */
public class BuKeBian {
  public static void main(String[] args) {
    List<String> list = List.of("randy", "demi");
    // list.add("Jack"); // 不能修改
    System.out.println(list);

    Set<String> set = Set.of("randy", "demi");
    // set.add("jack");// 不能修改
    System.out.println(set);

    Map<String, Integer> map = Map.of("randy",12, "demi", 27);
    // map.put("randy", 27);// 不能修改
    System.out.println(map);
  }
}
