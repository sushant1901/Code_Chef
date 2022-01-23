package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef12
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(y<=x){
                System.out.println("Pizza");
            }else if(z<=x)
            {
                System.out.println("Burger");
            }else{
                System.out.println("Nothing");
            }
        }
    }
}