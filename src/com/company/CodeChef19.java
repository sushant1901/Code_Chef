package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef19
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int n= sc.nextInt();
            int k= sc.nextInt();
            int c=0;
            if(k>n){
                System.out.println("-1");
            }else{
                c=0;
                for(int i=0;i<x;i++){
                    if(c==k){
                        c=0;
                    }
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
