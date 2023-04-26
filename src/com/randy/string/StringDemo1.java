package com.randy.string;

/**
 * @author randy
 * @date 2023/4/23 14:41
 */
public class StringDemo1 {
  public static void main(String[] args) {
    String str = "randy"; // 存储在常量池
    String str2 = "randy"; // 存储在常量池
    String str3 = new String("randy"); // 存储在堆内存
    String str4 = new String("randY"); // 存储在堆内存

    System.out.println(str == str2); // true
    System.out.println(str == str3); // false
    System.out.println(str3.equals(str)); // true
    System.out.println(str3.equalsIgnoreCase(str4)); // true
  }
}
