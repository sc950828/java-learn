package com.randy.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @author randy
 * @date 2023/5/18 9:32
 */
public class MapTest1 {
  public static void main(String[] args) {
    test1();
  }

  public static void test1() {
    Map<String, String> map = new HashMap<>();
    map.put("name", "randy");
    map.put("age", "27");
    map.put("age", "28");
    map.put("address", "湖南");
    map.put("address", "湖南2"); // 更新
    map.remove("age");
    System.out.println(map.isEmpty());
    System.out.println(map.size());
    System.out.println(map.containsKey("address"));
    System.out.println(map.containsValue("湖南"));
    System.out.println(map.get("address"));
    System.out.println(map);
//    map.clear();
    System.out.println(map.keySet()); // keys
    System.out.println(map.values()); // values

    Set<String> keySet = map.keySet();

    // 遍历1
    for (String str : keySet) {
      System.out.println(str + ":" + map.get(str)); // 值
    }

    // 遍历2
    keySet.forEach(str -> {
      System.out.println(str + ":" + map.get(str)); // 值
    });

    // 遍历3
    Set<Map.Entry<String, String>> set2 = map.entrySet();

    set2.forEach(ent -> {
      System.out.println( ent.getKey() + "->" + ent.getValue()); // 值
    });

    for(Map.Entry<String, String> ent : set2) {
      System.out.println( ent.getKey() + "-->" + ent.getValue()); // 值
    }

    // 遍历4
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String s, String s2) {
        System.out.println(s + "=>" + s);
      }
    });
    // 简化
    map.forEach((key, value) -> {
      System.out.println(key + "===>" + value);
    });


  }
}
