/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		ArrayList list=new ArrayList();
		list.add('A');
		list.add('D');
		list.add('O');
		list.add('P');
		list.add('Q');
		list.add('R');
		
		char twoholes='B';
		int count=0;
		int n;
		n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++)
		{
		    count=0;
		    for(int j=0;j<arr[i].length();j++)
		    {
		        if(list.contains(arr[i].charAt(j)))
		        count++;
		        if(arr[i].charAt(j)=='B')
		        count=count+2;
		    }
		    	System.out.println(count);
		}
	
	}
}
