package com.ggr.leecode.temp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class String2Arr {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str="";
        Date formatDate=sdf.parse(str);
        Date date = new Date();
        System.out.println(formatDate);
        System.out.println(date);
    }
    
}


