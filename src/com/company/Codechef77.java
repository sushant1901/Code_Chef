package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef77
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            //  System.out.println(n);
            int one=0,zero=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0')
                    zero++;
                else
                    one++;
            }
            int diff=0;
            if(zero-one>=0){
                diff=zero-one;
            }
            else{
                diff=one-zero;
            }
            if(diff<=1){
                System.out.println(n);
            }
            else{
                int x=n-(diff-1);
                System.out.println(x);
            }
        }
    }
}