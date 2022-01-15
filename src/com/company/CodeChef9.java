package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef9
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            System.out.println(solve(A, B, C) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean solve(int A, int B, int C) {
        return A + B + C == 180;
    }


}

