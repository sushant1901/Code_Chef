package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef8
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t=  sc.nextInt();
        while(t-->0){
            int d= sc.nextInt();
            int n= sc.nextInt();
            int curr=n;
            for(int i=1;i<=d;i++){
                curr=(curr*(curr+1))/2;
            }
            System.out.println(curr);

        }
        
    }
}

