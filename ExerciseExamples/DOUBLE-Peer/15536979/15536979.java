import java.io.*;
class DOUBLE 
{

	public static void main(String[] args)throws IOException
	{
		int t,h;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			h=Integer.parseInt(br.readLine());
			if(h%2==0)
				System.out.println(h);
			else
				System.out.println((h-1));
		}
		
	}

}
