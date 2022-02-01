package com.company;
import java.util.*;
import java.util.Arrays;
class CodeChef28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
