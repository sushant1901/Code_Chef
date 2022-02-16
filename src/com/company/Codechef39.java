package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef39
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int maxMod = -1;
            int j = 1;
            while(j <= k) { // go from 1 till k
                if(n%j > maxMod) {
                    maxMod = n%j;
                }
                j++;
            }
            System.out.println(maxMod);
        }
        sc.close();
    }
}
