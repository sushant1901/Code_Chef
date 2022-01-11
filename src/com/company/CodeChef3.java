package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner sc = new Scanner(System.in);

            int testCases = sc.nextInt();

            while(testCases-- > 0){
                int p = sc.nextInt();

                int k = 1;
                int res = 0;
/// 4098

                while(p > 0){
                    if(p > 2048){
                        int temp = (int) p / 2048;
                        res = res + temp;
                        k = 2048;
                        p = p - (temp * k);
                        continue;
                    }
                    if(k < p){
                        k = 2*k;
                    } else if(k == p){
                        res++;
                        p = p - k;
                    }
                    else{
                        k = k/2;
                        if(k > p){
                            continue;
                        }
                        p = p - k;
                        res++;
                    }
                }

                System.out.println(res);
            }
        }catch(Exception e){
            return;
        }
    }
}
