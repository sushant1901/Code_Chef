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
		    double n=sc.nextDouble();
		    int x=sc.nextInt();
		    Double subs=n/6;
		    Double newData = new Double(subs);
            int val = newData.intValue();
            if(n%6==0){
              System.out.println(val*x);  
            }else{
                System.out.println((val*x)+x);
		    
            }
		    
		    
		}
	}
}
