import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int[] array=new int[2];
		    array[0]=sc.nextInt();
		    array[1]=sc.nextInt();
		    int n=array[0];
		    int y=array[1];
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int size = 0;
		    int count = 0;
		    for(int i=0;i<arr.length;i++){
		        size = size|arr[i];
		    }
		    for(int j=0;j<=y;j++){
		        if((size|j) == y){
		            count++;
		            System.out.println(j);
		            break;
		        }
		    }
		    if(count==0){
		        System.out.println(-1);
		    }
		}

	}
}
