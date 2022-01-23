package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef11
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int basicSalary=sc.nextInt();
            if(basicSalary<=1500){
                System.out.println(basicSalary+(basicSalary*.1)+(basicSalary*.9));
            }else{
                System.out.println(basicSalary+500+(basicSalary*.98));
            }

        }

        // your code goes here
    }
}