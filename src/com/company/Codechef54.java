package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef54
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int r=0;
            if(x%10==0){
                r=x/10;
                System.out.println(r);
            }else if(x%5==0){
                r+=x/10;
                x=x%10;
                r+=x/5;
                System.out.println(r);
            }else{
                System.out.println(-1);
            }
        }
    }
}
