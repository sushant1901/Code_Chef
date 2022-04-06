package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef71
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = y*30;
            if(x > z){
                System.out.println("YES");
            }
            else if(x == z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}