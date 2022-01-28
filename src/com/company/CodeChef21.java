package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef21
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int h = sc.nextInt();
            double c = sc.nextDouble();
            int ts = sc.nextInt();

            if((h>50) && (c<0.7) && (ts>5600)) {
                System.out.println("10");
            }
            else if((h>50) && (c<0.7)) {
                System.out.println("9");
            }
            else if((c<0.7) && (ts>5600)) {
                System.out.println("8");
            }
            else if((h>50) && (ts>5600)) {
                System.out.println("7");
            }
            else if((h>50) || (c<0.7) || (ts>5600)) {
                System.out.println("6");
            }
            else {
                System.out.println("5");
            }
        }
        sc.close();
    }
}
