package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef35
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            int cwon=0, nwon=0,d=0;
            String str= sc.next();
            char [] s= str.toCharArray();
            for(int i=0;i< str.length();i++){
                if(s[i] =='C'){
                    cwon++;
                }else if(s[i]=='N'){
                    nwon++;
                }else{
                    d++;
                }
            }
            if(cwon > nwon){
                System.out.println(60*x);
            }else if(cwon < nwon){
                System.out.println(40*x);
            }else{
                System.out.println(55*x);
            }
        }
    }
}
