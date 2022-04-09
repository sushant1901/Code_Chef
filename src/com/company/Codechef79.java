package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef79
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int mul1 = a1*b1;
            int mul2 = x1*y1;
            if(mul2>=mul1){
                System.out.println("Yes");
            }
            else if(mul1>mul2){
                System.out.println("No");
            }
        }
    }
}