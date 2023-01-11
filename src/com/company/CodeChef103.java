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
		    int x= sc.nextInt();
		    String str=String.valueOf(x);
		    int len=str.length();
		    int flag=0;
		    for (int i=0;i<len;i++ ){
		        if(str.charAt(i)=='7'){
		           flag=1;
		            break;
		        }
		    } 
		    if(flag==1){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    
		}
	}
}
