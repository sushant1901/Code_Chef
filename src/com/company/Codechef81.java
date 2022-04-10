package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef81
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            if(n%4==3 || n%4==2) System.out.println("3");
            else if(n%4==0) System.out.println(3+n);
            else if(n%4==1) System.out.println(n);

        }

    }
}