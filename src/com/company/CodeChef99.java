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
		    int length = sc.nextInt();
		    int num = sc.nextInt();
		    
		    int[] array = new int[length];
		    int flag=0;
		    for(int i=0; i<length; i++){
		        array[i] = sc.nextInt();
		    }
		     for(int i=0; i<length; i++){
		         if(array[i] == num && i!=length-1){
		             flag=1;
		         }
		     }
		     if(length == 1 && num == array[0]){
		         System.out.println("Yes");
		         continue;
		     }
		     if(flag == 0) System.out.println("No");
		     else System.out.println("Yes");
		
		}
	}
}
