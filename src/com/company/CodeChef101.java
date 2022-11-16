/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int f=0;
		    int num=sc.nextInt();
		    int [] arr=new int[2*num];
		    HashMap<Integer,Integer> memo= new HashMap<>();
		    for(int i=0;i<2*num;i++){
		        arr[i]=sc.nextInt();
		       
		        if(memo.containsKey(arr[i])){
		            memo.put(arr[i],memo.get(arr[i])+1);
		        }else{
		            memo.put(arr[i],1);
		        }
		    }
		    
		    for(Map.Entry<Integer,Integer>m:memo.entrySet()){
		        if(m.getValue()>2){
		            f=1;
		            break;
		        }
		    }
		    if(f==1)System.out.println("No");
		    else System.out.println("Yes");
		    
		    
		}
	}
}
