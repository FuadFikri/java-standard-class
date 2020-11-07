package com.syamsudin.date;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date= new Date();

        System.out.println(date); //Fri Nov 06 20:34:27 WIB 2020

//        return millisecond
        System.out.println(date.getTime()); // 1604669454315

        Calendar calendar = Calendar.getInstance(); //bikin waktu saat ini
        Date dateCalendar = calendar.getTime();
        System.out.println(dateCalendar); //Fri Nov 06 20:34:27 WIB 2020

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY,10);
        calendar.set(Calendar.MINUTE,10);
        calendar.set(Calendar.SECOND,10);
        calendar.set(Calendar.MILLISECOND,10);

        Date result = calendar.getTime();
        System.out.println(result);

//        add untuk menambah atau mengurang
        calendar.add(Calendar.YEAR,-75);
        System.out.println(calendar.getTime());


    }
}
