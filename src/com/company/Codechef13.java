package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef13
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int cal=n-a;
            if(cal>=a){
                System.out.println(a);
            }else{
                System.out.println(cal);
            }
        }
    }
}
