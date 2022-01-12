package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            char ch=sc.next().charAt(0);

            if(ch=='B' || ch=='b')
                System.out.println("BattleShip");
            else if(ch=='C' ||ch=='c')
                System.out.println("Cruiser");
            else if(ch=='D' || ch=='d')
                System.out.println("Destroyer");
            else
                System.out.println("Frigate");
        }

    }
}
