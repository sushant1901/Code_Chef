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
		Scanner  sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int shelves=sc.nextInt();
		    int books= sc.nextInt();
		    int boxCapacity=sc.nextInt();
		    if(boxCapacity >= books){
		        System.out.println(shelves);
		    }else{
		        if(books % boxCapacity==0) {
		        System.out.println(shelves*(books/boxCapacity));
		        }
		        else System.out.println(shelves*(books/boxCapacity +1));
		        
		    }
		    
		    
		    
		}
	}
}
