package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef24
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        int m1, m2;

        while(t-- > 0) {
            int n = sc.nextInt();
            m1 = Integer.MAX_VALUE;
            m2=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                if(a < m1) {
                    m2 = m1;
                    m1 = a;
                } else if(a >= m1 && a < m2) {
                    m2 = a;
                }
            }
            System.out.println(m1 + m2);
        }
        sc.close();
    }
}
