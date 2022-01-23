package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef14
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] a= new int[n];
            double sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            Arrays.sort(a);
            sum-=a[n-1];
            sum= sum/(n-1);
            System.out.println(String.format("%.6f", sum+a[n-1]));
        }
    }
}
