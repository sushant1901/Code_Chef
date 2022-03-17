package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef51 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            char a[] = str.toCharArray();
            char b[] = new char[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (b[i] != a[i]) {
                    char temp = b[i];
                    b[i] = b[n - 1 - i];
                    b[n - 1 - i] = temp;
                }
            }
            String s1 = new String(a);
            String s2 = new String(b);
            if (s1.equals(s2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}