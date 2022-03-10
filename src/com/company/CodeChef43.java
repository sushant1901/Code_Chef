package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef43
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int x= sc.nextInt();
            int [] arr=new int[n];
            int i;
            int flag=0;
            for(i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            for(i=n-1;i>=0;i--){
                if(arr[i]<x){
                    flag=i+1;
                    break;
                }else{
                    flag=0;
                }

            }
            System.out.println(flag);

        }
    }
}
