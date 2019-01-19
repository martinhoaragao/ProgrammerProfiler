import java.io.*;
 
class Holes 
{
	public static void main(String[] arg)throws IOException 
	{
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			int sum=0;
			char []ch=br.readLine().toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='A'||ch[j]=='D'||ch[j]=='O'||ch[j]=='P'||ch[j]=='Q'||ch[j]=='R')
				sum++;
				else if(ch[j]=='B')
				sum+=2;
			}
	    System.out.println(sum);
		}
	}
}