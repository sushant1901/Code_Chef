package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef67
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();

            if(Math.max(a1,b1) - Math.min(a1,b1) >2 || Math.max(a1,b1) - Math.min(a1,b1) <= 0) System.out.println("0");
            else if(Math.min(a1,b1) == 1 || Math.max(a1,b1) == n || Math.max(a1,b1) - Math.min(a1,b1) == 2) System.out.println("1");
            else System.out.println("2");
        }
    }

}
