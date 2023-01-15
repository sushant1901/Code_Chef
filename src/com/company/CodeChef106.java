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
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int x1= sc.nextInt();
		    int y1= sc.nextInt();
		    int x2= sc.nextInt();
		    int y2= sc.nextInt();
		    
		   double a = Math.pow(Math.abs(x1),2) + Math.pow(Math.abs(y1),2);
		    double b = Math.pow(Math.abs(x2),2) + Math.pow(Math.abs(y2),2);
		    
		    double dist1 = Math.sqrt(a);
		    double dist2 =Math.sqrt(b);
		    
		    if(dist1 == dist2 ){
		        System.out.println("Equal");
		    }else if (dist1> dist2){
		        System.out.println("Alex");
		    }else{
		        System.out.println("Bob");
		    }
		}
		    
	}
}
