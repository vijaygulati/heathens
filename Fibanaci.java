package com.company;

import java.util.Scanner;

public class Fibanaci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner s = new Scanner(System.in);     // Scanner is used to input the variables into the code
        int n=s.nextInt();      // input the no. for which you want to find fibanaci term
        while(n>0)
        {
                int c=a+b;
                a=b;
                b=c;
                n--;
        }
        System.out.println(a);      // print the fibannaci th  no.
    }
}
