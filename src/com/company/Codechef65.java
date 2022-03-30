package com.company;
import java.util.*;
class CodeChef65
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int l = m-k;
            if(l>n){
                System.out.println("yes");
            }
            else if(l==n){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}