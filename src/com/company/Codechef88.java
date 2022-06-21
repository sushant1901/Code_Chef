import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(a==b) System.out.println("yes");
		    int diff=(b-a)%3;
		    if(diff==0 || diff==1)System.out.println("yes");
		    else System.out.println("no");
			
		}
	}
}
