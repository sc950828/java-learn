package com.randy.variable;

public class StringLeiXing {
    public static void main(String[] arg) {
        // String 不是基本数据类型，属于引用数据类型
        // 使用一对""来表示一个字符串，内部可以包含 0 个、1 个或多个字符。
        //  声明方式与基本数据类型类似。例如：String str = "randy";
        // 必须使用双引号

        // 任意八种基本数据类型的数据与 String 类型只能进行连接“+”运算，且结果一定也是 String 类型
        // 八种基本数据类型 byte short int long float double char boolean
        


        String s1 = "randy";
        System.out.println(s1);

        String s2 = "";
        System.out.println(s2);

        System.out.println(s2 == "");
        System.out.println(s2 == null);
    }
}
