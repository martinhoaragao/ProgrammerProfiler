import java.util.*;
import java.io.*;
class TREEROOT
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int num=Integer.parseInt(br.readLine());
			int Ar[][]=new int[num][2];
			int sum=0;
			for(int i=0;i<num;i++)
			{
				String[] data=br.readLine().split(" ");
				int x=Integer.parseInt(data[0]);
				int y=Integer.parseInt(data[1]);
			     sum+=x-y;
			}
			System.out.println(sum);
		}
	}
}