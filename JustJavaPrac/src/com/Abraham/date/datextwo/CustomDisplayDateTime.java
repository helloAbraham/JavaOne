/**
     This is the simple Date and Time formate
     Java Project. Here we can customize the date and time display
 */
package com.Abraham.date.datextwo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDisplayDateTime {

    public static void main(String[] args) {
        Date cusDate = new Date();
        SimpleDateFormat sft = new SimpleDateFormat("E MM.dd.yyyy 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + sft.format(cusDate));

        System.out.println("---- *** ----");
        //We can make different patter like / /
        SimpleDateFormat sftd = new SimpleDateFormat("E MM/dd/yyyy 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + sftd.format(cusDate));

    }
}
