package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef17
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();
            int buy= x*y;
            int sell=x*z;
            System.out.println(sell- buy);

        }
    }
}

