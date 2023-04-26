package com.randy.variable;

public class ZhengXing {
    public static void main(String[] arg) {
        byte b = 123; // 1字节
        short s = 1234; // 2字节
        int i = 123456789; // 4字节
        // 右边的整数常量值如果超过 int 范围，必须加 L/l，显式表示 long 类型。否则编译不通过。
        long l = 1234567890L; //8字节 一般会提供L/l后缀

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        Integer i1 = 12;
        int i2 = 12;
        int i3 = i1;
        System.out.println(i1);
        System.out.println(i3);
        System.out.println(i1 == i2);

        System.out.println(i1.toString());
        System.out.println(Integer.toString(i3));

        System.out.println(Integer.parseInt("24"));
        System.out.println(Integer.valueOf("24"));
        System.out.println(Double.parseDouble("24.2"));
        System.out.println(Double.valueOf("24.2"));
    }
}
