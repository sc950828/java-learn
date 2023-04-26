package com.randy.variable;

public class QiangZhiZhuanHuan {
    public static void main(String[] arg) {
        // 规则：将取值范围大（或容量大）的类型强制转换成取值范围小（或容量小）的类型。
        // 自动类型提升是 Java 自动执行的，而强制类型转换是自动类型提升的逆运算，需要我们自己手动执行。
        // 数据类型 1 变量名 = (数据类型 1)被强转数据值; //()中的数据类型必须<=变量值的数据类型。

        double d = 123.4;
        int i = (int)d;
        System.out.println(i);//123

        // 当把存储范围大的值（常量值、变量的值、表达式计算的结果值）强制转换为存储范围小的变量时，可能会损失精度或溢出。
        double d2 = 3.14;
        int i2 = (int)d2;
        System.out.println(i2); // 3

        // 当某个值想要提升数据类型时，也可以使用强制类型转换。这种情况的强制类型转换是没有风险的，通常省略。
        int i3 = 1;
        int j3 = 2;
        double bigger = (double)(i3/j3);
        System.out.println(bigger); // 0.0

        // 声明 long 类型变量时，可以出现省略后缀的情况。float 则不同。
        long l1 = 123L;
        long l2 = 123;//如何理解呢？ 此时可以看做是 int 类型的 123 自动类型提升为 long 类型

        // long l3 = 123123123123; //报错，因为 123123123123 超出了 int 的范围。
        long l4 = 123123123123L;

        //float f1 = 12.3; //报错，因为 12.3 看做是 double，不能自动转换为 float类型
        float f2 = 12.3F;
        float f3 = (float)12.3;
    }
}
