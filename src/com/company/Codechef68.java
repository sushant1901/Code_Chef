package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef68
{
    static int checksum(int n){
        int s=0 , r=0;
        while(n>0){
            r = n%10;
            s = s + r;
            n = n/10;
        }
        return s;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s = checksum(n);
            if(s%2==0){
                while(s%2==0){
                    n=n+1;
                    s = checksum(n);
                }
                System.out.println(n);
            }
            else{
                while(s%2==1){
                    n=n+1;
                    s = checksum(n);
                }
                System.out.println(n);
            }



        }
    }
}
