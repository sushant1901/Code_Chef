package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef15
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            String s="";
            int x=97;
            for(int i=0;i<n;i++){
                s+=(char)x;
                x+=1;
                if(x>122){
                    x-=26;
                }
            }
            System.out.println(s);

        }
    }
}
