package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef85
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k==1){
                if(n%4==0) System.out.println("ON");
                else System.out.println("Ambiguous");
            }
            else{
                if(n%4==0) System.out.println("OFF");
                else System.out.println("ON");
            }
        }
    }
}