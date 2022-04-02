package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef69
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String d= sc.next();
            boolean r=d.contains("0");
            boolean r2= d.contains("5");
            if(r== true || r2==true)System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
