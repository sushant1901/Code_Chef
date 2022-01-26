package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef16
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            String s=sc.next();
            int f1=0,f2=0;
            for (int i = 0; i < a; i++) {
                if(s.charAt(i) == 'I'){
                    f1++;
                    break;
                }
                else if(s.charAt(i) == 'Y'){
                    f2++;
                    break;
                }

            }
            if(f1>0){
                System.out.println("INDIAN");
            }
            else if(f2>0){
                System.out.println("NOT INDIAN");
            }
            else{
                System.out.println("NOT SURE");
            }

        }
    }
}
