/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(ob.readLine());
	while(t-->0)
	{
	    String str=ob.readLine();
	    int l=str.length();
	    int count=0;
	    for(int i=0;i<l;i++)
	    {
	        char ch=str.charAt(i);
	        
	        switch(ch)
	        {
	            case 'A':
	            count++;
	            break;
	            case 'B':
	            count+=2;
	            break;
	            case 'D':
	            count++;
	            break;
	            case 'O':
	            count++;
	            break;
	            case 'P':
	            count++;
	            break;
	            case 'Q':
	            count++;
	            break;
	            case 'R':
	            count++;
	            break;
	        }
	    }
	    System.out.println(count);
	        }
	    }} 

