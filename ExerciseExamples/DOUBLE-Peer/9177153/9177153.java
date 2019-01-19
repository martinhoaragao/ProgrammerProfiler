import java.io.*;
class doublestring
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
			int a=Integer.parseInt(br.readLine());
			if(a%2==0)
				System.out.println(a);
			else
				System.out.println(a-1);
			n--;
		}
	}
}