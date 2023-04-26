package com.randy.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author randy
 * @date 2023/4/26 14:49
 */
public class ArrayDemo2 {
  public static void main(String[] args) {
    String[] strArr = new String[]{"Randy", "Demi"};

    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));

    Integer[] intArr = new Integer[]{12, 15,1,2,16};

    Arrays.sort(intArr, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        // return o1 - o2;
        return o2 - o1; // 倒叙
      }
    });

    System.out.println(Arrays.toString(intArr));
  }
}
