package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef50 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int sum = 0;
            int c = 0;
            int temp = -1;
            for (int i = 0; i < n; i++) {
                if (sum + a[i] >= k) {
                    temp = i;
                    break;
                }
                sum += a[i];
                c++;
            }
            if (temp == -1) {
                System.out.println(n);
            } else {
                if (a[temp] % 2 == 0) {
                    if ((a[temp] / 2 + sum) <= k) {
                        c = c + 1;
                    }
                } else {
                    if ((a[temp] / 2 + sum + 1) <= k) {
                        c++;
                    }
                }
                System.out.println(c);
            }


        }

    }
}