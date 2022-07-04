/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int p=sc.nextInt();
		    int ans=p/100;
		    int r=p%100;
		    if((r+ans)<=10){
		        System.out.println(r+ans);
		    }
		else{
		        System.out.println("-1");
		    }
		}
	}
}
