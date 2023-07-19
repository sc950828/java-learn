package com.randy.kebiancanshu;

/**
 * @author randy
 * @date 2023/5/17 14:12
 */
public class Test1 {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3));
  }

  // 一个形参列表中可变参数只能有一个
  // 可变参数必须放在形参列表的最后面
  public static int sum(int ...nums) {
    int sum = 0;

//    for (int i=0;i<nums.length;i++) {
//      sum += nums[i];
//    }

    for (int i: nums) {
      sum += i;
    }


    return sum;
  }
}
