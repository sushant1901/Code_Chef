package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


class CodeChef87
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(x % n == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
