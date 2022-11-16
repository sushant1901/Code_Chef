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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		   
		   System.out.println(isPrime(x+y) ? "Alice":"Bob");
		}
	}
	static boolean isPrime(int num)
    {
        if (num <= 1)return false;
        else if (num == 2)return true;
        else if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)return false;
        }
        return true;
    
    }
}	

