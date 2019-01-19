/*Write a program which will count the holes in the program and 
will show output on the screen*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class holes 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String p;
		int testCases;
		testCases=Integer.parseInt(in.readLine());
		while(testCases>0)
		{
			p=in.readLine();
			System.out.println(holeCounter(p));
			testCases--;
		}
	}

	public static int holeCounter(String p)
	{
		int[] arr={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
         int count=0;
		for(int i=0;i<p.length();i++)
		{
			count+=arr[p.charAt(i)-65];
		}
		return count;
	}
}