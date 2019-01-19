/* package codechef; // don't place package name! */
 import java.util.*;
 import java.lang.*;
 import java.io.*;
 /* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n+1];
		    for(int i=1; i<=n;i++){
		       arr[i] = sc.nextInt();
		    }
		    int k = sc.nextInt();
		    int m = arr[k];
		    Arrays.sort(arr);
		    for(int i=0; i<=n; i++){
		        if(arr[i]==m){
		            System.out.println(i);
		            break;
		        }
		        else{
		            continue;
		        }
		    }
		    
		}    
	} 
 }
