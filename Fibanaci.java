package com.company;

import java.util.Scanner;

public class Fibanaci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
                int c=a+b;
                a=b;
                b=c;
                n--;
        }
        System.out.println(a);
    }
}
