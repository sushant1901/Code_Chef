package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef80
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int A=s.nextInt();
            int B=s.nextInt();
            // int x=a,y=a+1;
            int GCD=-1;
            if(A%2==0){
                if((A+2)<=B){
                    System.out.print(A);
                    System.out.print(" ");
                    System.out.println(A+2);
                }
                else{
                    System.out.println(GCD);
                }
            }
            else if(A%3==0){
                if((A+3)<=B){
                    System.out.print(A);
                    System.out.print(" ");
                    System.out.println(A+3);
                }
                else{
                    System.out.println(GCD);
                }
            }
            else{
                if((A+3)<=B){
                    System.out.print(A+1);
                    System.out.print(" ");
                    System.out.println(A+3);
                }
                else{
                    System.out.println(GCD);
                }
            }
        }
    }
}
