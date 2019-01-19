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
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int xPos, arrLen, uncle;
		
		for(int i = 0; i < cases; i++){
		    arrLen = scan.nextInt();
		    int arr[] = new int[arrLen];
		    for(int j = 0; j < arrLen; j++){
		        arr[j] = scan.nextInt();
		    }
		    xPos = scan.nextInt();
		    uncle = arr[xPos - 1];
		    Arrays.sort(arr);
		    for(int k = 0; k < arrLen; k++){
		        if(arr[k] == uncle){
		            xPos = k + 1;
		        }
		    }
		    System.out.println(xPos);
		}
	
		
		
	}
}