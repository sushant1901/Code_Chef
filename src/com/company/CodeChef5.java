package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef5
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= n/2; ++i) {
                if (n% i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
