/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
			int pos,num=sc.nextInt(),arr[]=new int[num],stor;
			for(int i=0;i<num;i++) arr[i]=sc.nextInt();
			pos=sc.nextInt();
			stor=arr[pos-1];
			Arrays.sort(arr);
			for(int i=0;i<num;i++){
				if(stor==arr[i]){
					System.out.println(i+1);
					break;
				}
			}
			t--;
		}
		// your code goes here
	}
}