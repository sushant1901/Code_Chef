package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef6
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            float dis=a*b;
            if(a>1000)
            {
                dis=dis-(dis/10);
                System.out.println(dis);
            }
            else
            {
                System.out.println(dis);
            }
        }

    }
}
