package com.company;

import java.util.Scanner;

public class Pascal_triangle {
    public static void main(String args[]) {
        int r, i, k, number=1, j;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        r = scan.nextInt();     // input the no. of rows in the pattern of the pascal trianlge

        for(i=0;i<r;i++)        // loop for the rows
        {
            for(k=r; k>i; k--)      // loop for the spaces
            {
                System.out.print(" ");
            }
            number = 1;
            for(j=0;j<=i;j++)       // loop for the columns
            {
                System.out.print(number+ " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();   // jump to the next line
        }
    }
}
