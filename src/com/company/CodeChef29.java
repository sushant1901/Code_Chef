package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef29
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int y= sc.nextInt();
            if (x==y){
                System.out.println(2*x - 1);
            }else if(y==0){
                System.out.println(x);
            }else{
                System.out.println(x+y);
            }
        }
    }
}