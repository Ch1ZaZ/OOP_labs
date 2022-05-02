package com.company;

public class Fifth_task {
    public static void main(String[] args){
        int h,t,o;
        h=1;
        t=6;
        o=7;
        if(h>t && t>o) {
            System.out.println(h+","+t+","+o);
        }
        if(h>o && o>t) {
            System.out.println(h+","+o+","+t);
        }
        if(t>h && h>o) {
            System.out.println(t+","+h+","+o);
        }
        if(t>o && o>h) {
            System.out.println(t+","+o+","+h);
        }
        if(o>h && h>t) {
            System.out.println(o+","+h+","+t);
        }
        if(o>t && t>h) {
            System.out.println(o+","+t+","+h);
        }
    }
}
