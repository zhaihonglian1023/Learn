package com.example.learn.domain;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class LambdaStudy {
    public int differentDays(Date date1,Date date2){
        if (date1==null || date2==null){
            return 0;
        }
        return  (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
    }
    public Date formatDate(String dateStr, String format) {
        if (null == dateStr || "".equals(dateStr.trim())){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        LambdaStudy lambdaStudy = new LambdaStudy();
        int differ = lambdaStudy.differentDays(lambdaStudy.formatDate("2021-07-12","yyyy-MM-dd"),lambdaStudy.formatDate("2021-12-12","yyyy-MM-dd") )/15;
        differ = Math.max(differ, 0);
        differ = Math.min(differ, 4);
        System.out.println(differ);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int icon = random.nextInt(40) + 1;
            if(icon!=40){
                continue;
            }
            else {
                System.out.println(icon);
            }
        }
    }
}
