package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef23
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int Test= sc.nextInt();
        while (Test-->0)
        {
            long base= sc.nextInt();
            base=base-2;
            base=Math.floorDiv(base,2);
            System.out.println(base*(base+1)/2);
        }
    }
}
