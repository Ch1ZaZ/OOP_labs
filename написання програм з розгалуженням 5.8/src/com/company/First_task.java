package com.company;
import java.util.Scanner;

public class First_task {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if(n>=50&n<=100){
            System.out.println("Число"+" "+n+" "+"належить проміжку (50;100)");
        }
        else {
            System.out.println("Число"+" "+n+" "+"не належить проміжку (50;100)");
        }
    }
}
