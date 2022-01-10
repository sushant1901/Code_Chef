package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
class CodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int[] a=new int[2];
            int i;
            for( i= 0;i<2;i++){
                a[i]=sc.nextInt();
            }
            if(a[0]>a[1]){
                System.out.println(">");
            }else if(a[0]<a[1]){
                System.out.println("<");
            }else if(a[0]==a[1]){
                System.out.println("=");
            }else{
                System.out.println();
            }


        }
    }
}