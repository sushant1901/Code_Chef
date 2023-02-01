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
		    int n= sc.nextInt();
		    String bhanumati =sc.next();
		    int shunye=0;
		    int ek=0;
		    for(int i=0;i<n;i++){
		        if(bhanumati.charAt(i)=='0'){
		            shunye++;
		            
		        }else{
		            ek++;
		        }
		    }
		    if(shunye>=ek) System.out.println(ek);
		    else System.out.println(shunye+1);
		}
	}
}
