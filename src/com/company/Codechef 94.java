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
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0){
	      int p = sc.nextInt();
	      int q = sc.nextInt();
	      int r = sc.nextInt();
	      int s = sc.nextInt();
	      if((p != r && q != s) || (p == s && q == r)){
	         System.out.println("1");
	      }
	      if((p != r && q == s) || (p == r && q != s)){
	         System.out.println("2");
	       }
	      
	  }   
	}
}
