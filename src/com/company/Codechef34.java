package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef34
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            // taking input.
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s= sc.next();
            // declaring srating and ending spot.
            int l=0,h=n-1,m=0;
            char [] s1= s.toCharArray();
            while(l<=h){
                if(s1[l]!=s1[h]){
                    m++;
                }
                // updation of spots.
                l++;
                h--;
            }
            int res= k-m;
            if(res>=0 && res%2==0){
                System.out.println("YES");
            }else if(res>=0 && n%2==1){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }
        }
    }
}
