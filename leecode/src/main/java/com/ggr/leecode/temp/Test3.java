package com.ggr.leecode.temp;


import java.text.ParseException;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        MyThread my=new MyThread();
        System.out.println(1234);
        my.run();
        System.out.println(1234);
        StringBuffer sb = new StringBuffer("abcdefg");
        System.out.println(sb.reverse());
    }

    static class MyThread extends Thread {
        public void run(){
            try {
                System.out.println("休眠前");
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("休眠后");
        }
    }
}
