package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef66
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int ans=0;
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Long,Integer> bc = new HashMap<>();
        for(int i=0;i<n;i++){
            int y_axis = sc.nextInt();
            int y_speed = sc.nextInt();

            long key = y_axis*y_speed;

            if(bc.containsKey(key)){
                int value = bc.get(key);
                value++;
                bc.replace(key,value);
            }else{
                bc.put(key,1);
            }
        }

        for(int i=0;i<m;i++){
            int x_axis = sc.nextInt();
            int x_speed = sc.nextInt();
            long key = x_axis*x_speed;
            if(bc.containsKey(key) && bc.get(key)>0){
                ans++;
                int value = bc.get(key);
                value--;
                bc.replace(key, value);
            }
        }
        System.out.println(ans);

    }
}
