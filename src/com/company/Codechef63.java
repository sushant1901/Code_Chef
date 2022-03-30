package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef63
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String str = sc.next();
            int z=0 , o=0;
            String new_str="";
            for(int i=0 ; i<n ; i++ )
            {
                if(str.charAt(i)=='0'){
                    z++;
                }
                else{
                    o++;
                }
            }
            if(z==n || o==n){
                System.out.println('0');
            }
            else{
                if(x>y){

                    System.out.println(y);
                }
                else{
                    System.out.println(x);
                }

            }
        }
    }
}