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
		int tina = sc.nextInt();
		while(tina-->0){
		    int xxx = sc.nextInt();
		    int leone = sc.nextInt();
		    int dani = sc.nextInt();
		    
		    
		    if(xxx < leone && xxx < dani) System.out.println("ALICE");
		    else if(leone < xxx && leone < dani) System.out.println("BOB");
		    else System.out.println("CHARLIE");
		}

	}
}
