package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef45
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>=b && a>=c){
                System.out.println(a);
            }else if(b>=a && b>=c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
