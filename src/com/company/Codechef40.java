package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef40
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            int k= sc.nextInt();
            int n=sc.nextInt();
            int p;
            int c;
            int z=x-y;
            int f=0;
            for(int i=0;i<n;i++){
                p=sc.nextInt();
                c= sc.nextInt();
                if(p>=z && c<=k){
                    f=1;
                }
            }
            if(f==1){
                System.out.println("LuckyChef");
            }else{
                System.out.println("UnluckyChef");
            }

        }
    }
}