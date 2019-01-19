import java.io.*;
class Main
{  public static void main(String args[])throws IOException
 {try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n,i=0;int s[]=new int[100];
	while(true)
	{
		n=Integer.parseInt(br.readLine());
		if(n==42)break;
		s[i++]=n;
	}
	for(int j=0;j<i;j++)System.out.println(s[j]);}catch(Exception e){return;}
	
}}