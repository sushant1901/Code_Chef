package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef30
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            // taking x a b input.
            if(x%a==0){
                int d=x/a;
                int mul=b*d;
                int sum = 0;
                //performing some operation.
                for(int i=1;i<=Math.sqrt(mul);i++){
                    // taking conditions.
                    if(sum>x)
                        break;
                    if(mul%i==0){
                        sum= sum+i;
                        if(mul/i!=i)
                            sum=sum+mul/i;
                    }
                }
                if(sum!=x){
                    System.out.println("-1");// printing if condition does not satisfies
                }else{
                    System.out.println(mul);// printing if conditoin satisfies
                }

            }else{
                System.out.println("-1");
            }
        }
    }
}
