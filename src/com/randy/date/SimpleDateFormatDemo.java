package com.randy.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author randy
 * @date 2023/4/26 14:12
 */
public class SimpleDateFormatDemo {
  public static void main(String[] args) throws ParseException {
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String str = sdf.format(d);
    System.out.println(str);

    Date d2 = sdf.parse("2022-12-12 14:12:87");
    System.out.println(d2);
  }
}
