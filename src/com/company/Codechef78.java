package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef78
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int ones=0 , zeros=0;
            int len = sc.nextInt();
            String pal = sc.next();

            // char ch[] = pal.toCharArray();
            for(int i =0 ; i<len ; i++){
                if(pal.charAt(i)=='0'){
                    zeros++;
                }
                else{
                    ones++;
                }
            }
            if(len%2==0){
                if(zeros==ones ){
                    System.out.println("YES");
                }
                else if(ones%2==0 && zeros%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("YES");
            }
        }
    }
}