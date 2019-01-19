import java.io.*;
import java.util.*;
class Sol
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=-1,j=0,k=0;
		while(++i<t)
		{
			int no=sc.nextInt();
			long songLength[]=new long[no];
			j=0;
			for(;j<no;j++)
				songLength[j]=sc.nextLong();
			
			int indexOfUncleJohny=sc.nextInt();
			
			long UncleJohny=songLength[indexOfUncleJohny-1];
			
			Arrays.sort(songLength);
			for(j=0;j<no;j++)
			{
				if(songLength[j]==UncleJohny)
					break;
			}
			System.out.println(j+1);
		}
	}
}