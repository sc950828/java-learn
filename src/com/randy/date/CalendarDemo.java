package com.randy.date;

import java.util.Calendar;

/**
 * @author randy
 * @date 2023/4/26 14:25
 */
public class CalendarDemo {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.println(c.getTime());
    System.out.println(c.getTimeInMillis());
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONTH));
    System.out.println(c.get(Calendar.DATE));
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
  }
}
