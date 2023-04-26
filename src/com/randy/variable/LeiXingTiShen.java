package com.randy.variable;

public class LeiXingTiShen {
    public static void main(String[] arg) {
        byte b1 = 1;
        char c1 = 'A';
        short s1 = 123;
        int i1 = 1234;
        long l1 = 1234567;

        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        // 自动累类型提升,java自动支持

        // 当把存储范围小的值（常量值、变量的值、表达式计算的结果值）赋值给了存储范围大的变量时
        s1 = b1;
        i1 = b1;
        l1 = i1;
        s1 = b1;

        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        // 当存储范围小的数据类型与存储范围大的数据类型变量一起混合运算时，会按照其中最大的类型运算。
        int i = 1;
        byte b = 1;
        double d = 1.0;
        double sum = i + b + d;//混合运算，升级为 double
        System.out.println(sum); // 3.0

        // 当 byte,short,char 数据类型的变量进行算术运算时，按照 int 类型处理。
        //byte b3 = b1 + c1;//编译报错，b1 + b2 自动升级为 int
        int sum2 = b1 + c1;//至少需要使用 int 类型来接收
        System.out.println(sum2);// 66

    }
}
