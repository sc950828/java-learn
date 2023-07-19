package com.randy.jihe;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author randy
 * @date 2023/5/24 9:54
 */
public class StreamTest1 {
  public static void main(String[] args) {
    // list
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "张三", "李四" , "王五", "张三丰","张三丰");

    list.stream().filter(s -> {
      return s.startsWith("张");
    }).forEach(s -> {
      System.out.println(s);
    });

    long count = list.stream().filter(s -> {
      return s.startsWith("张");
    }).count();
    System.out.println(count);

    list.stream().filter(s -> {
      return s.startsWith("张");
    }).limit(1).forEach(s -> {
      System.out.println(s);
    });

    list.stream().filter(s -> {
      return s.startsWith("张");
    }).skip(1).forEach(s -> {
      System.out.println(s);
    });

    list.stream().distinct().forEach(s -> {
      System.out.println("distinct方法 " + s);
    });

    list.stream().map((String s) -> {
        return "map方法 " + s;
      }
    ).forEach(s -> {
      System.out.println(s);
    });

    // 转list1
    System.out.println(list.stream().filter(s -> {
      return s.startsWith("张");
    }).toList()); // 不可变的list
    // 转list2
    Stream<String> str1Stream = list.stream().filter(s -> {
      return s.startsWith("王");
    });
    List<String> list2 = str1Stream.collect(Collectors.toList());
    System.out.println(list2);

    // 转set
    Stream<String> str2Stream = list.stream().filter(s -> {
      return s.startsWith("王");
    });
    Set<String> set1 = str2Stream.collect(Collectors.toSet());
    System.out.println(set1);

    // map
    Map<String, Integer> map = new HashMap();
    map.put("randy", 27);
    map.put("demi", 28);

    Stream<String> mapKeyStream = map.keySet().stream();
    Stream<Integer> mapValueStream = map.values().stream();
    Stream<Map.Entry<String, Integer>> mapKeyAndValueStream = map.entrySet().stream();

    // array
    String[] strArr = new String[]{"randy", "demi"};
    Stream<String> strStream = Arrays.stream(strArr);
    Stream<String> strStream2 = Stream.of(strArr);
    // 流合并
    Stream<String> strAllStream = Stream.concat(strStream, strStream2);
    Object[] arr = strAllStream.toArray();

    System.out.println(Arrays.toString(arr));
    // for (Object s:arr) {
    //   System.out.println(s);
    // }
  }
}
