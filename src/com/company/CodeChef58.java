package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef58
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int len = s.length();
            int o=0 ;
            int z=0;
            for(int i =0 ; i<len ; i++){
                if(s.charAt(i)=='0'){
                    z++;
                }
                else{
                    o++;
                }
            }
            if(z==o){
                System.out.println(2*o);
            }
            else{
                int r = Math.min(z,o);
                System.out.println((2*r) +1 );

            }
        }
    }
}