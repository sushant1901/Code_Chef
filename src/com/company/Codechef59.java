package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef59
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a= sc.nextInt();
            int b=sc.nextInt();
            int co=0;
            if(x==a){
                co+=1;
            }
            if(x==b){
                co+=1;
            }
            if(y==a){
                co+=1;
            }
            if(y==b){
                co+=1;
            }

            System.out.println(Math.abs(co-2));
        }
    }
}
