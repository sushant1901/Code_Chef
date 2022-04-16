package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef83
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            if(x==1 || x%3==1){
                System.out.println("huge");
            }
            if(x==2 || x%3==2){
                System.out.println("small");
            }
            if(x==3 || x%3==0){
                System.out.println("normal");
            }


        }
    }
}
