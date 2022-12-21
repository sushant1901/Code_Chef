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
		    int n=sc.nextInt();
		    int x= sc.nextInt();
		    int sum=0;
		    int freshness[]= new int[n];
		    int cost[]= new int[n];
		    
		    for(int i=0;i<n;i++){
		        freshness[i]=sc.nextInt();
		        
		    }
		    
		    for(int i=0;i<n;i++){
		        cost[i]=sc.nextInt();
		        
		    }
		    for(int i=0;i<n;i++){
		        if(freshness[i] >=x){
		            sum+=cost[i];
		        }
		    }
		    
		    System.out.println(sum);
		}
	}
}
