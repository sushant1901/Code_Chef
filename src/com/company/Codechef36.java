package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef36
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            int p1=a*b;
            int p2=x*y;
            if(p1>p2){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}