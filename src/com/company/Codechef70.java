package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef70
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            while(t-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x<y){
                    System.out.println("FIRST");
                }
                else if(x == y){
                    System.out.println("ANY");
                }
                else{
                    System.out.println("SECOND");
                }
            }
        }
        catch(Exception e){

        }
    }
}