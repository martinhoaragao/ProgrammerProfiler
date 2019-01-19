/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
        int x=0,k=0,min;
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int s[]=new int[n+1];
            for(int i=1;i<=n;i++){
                s[i]=sc.nextInt();
            }
            int p =sc.nextInt();
            int count=0,h=1;
            for(int i=1;i<=n;i++){
                if(s[i]<s[p]){
                    count+=1;
                }
            }
                
            System.out.println(count+1);
            t--;
        }
    }
}
