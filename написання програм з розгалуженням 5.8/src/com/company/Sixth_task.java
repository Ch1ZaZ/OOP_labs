package com.company;

public class Sixth_task {
    public static void main(String[] args) {
        int n =3600;
        int s =n/3600;
        if(s<1) {
            System.out.println("До кінця робочого дня залишилось менше 1 години");
        }
        else {
            System.out.println("До кінця робочого дня залишилось"+" "+s+" "+"годин(a)");
        }
    }
}
