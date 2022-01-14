package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef7
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int dragon[] = new int[3];
            int sloth[] = new int[3];

            for(int i=0;i<3;i++){
                dragon[i] =sc.nextInt();
            }
            for(int i=0;i<3;i++){
                sloth[i] = sc.nextInt();
            }
            int dragon_total=0,sloth_total=0;
            for(int i=0; i < dragon.length;i++){
                dragon_total += dragon[i];
            }
            for(int i=0;i < sloth.length;i++){
                sloth_total += sloth[i];
            }
            if(dragon_total > sloth_total){
                System.out.println("Dragon");
            }
            if(dragon_total < sloth_total){
                System.out.println("Sloth");
            }
            if(dragon_total == sloth_total && dragon[0] > sloth[0]){
                System.out.println("Dragon");

            }
            if(dragon_total == sloth_total && dragon[0] < sloth[0]){
                System.out.println("Sloth");
            }
            if(dragon_total == sloth_total && dragon[0] == sloth[0] && dragon[1] > sloth[1]){
                System.out.println("Dragon");

            }
            if(dragon_total == sloth_total && dragon[0] == sloth[0] && dragon[1] < sloth[1]){
                System.out.println("sloth");
            }
            if(dragon_total == sloth_total && dragon[0] == sloth[0] && dragon[1] == sloth[1]){
                System.out.println("Tie");
            }
        }
        sc.close();
    }
}
