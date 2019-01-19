import java.io.*;
class Main
{  public static void main(String args[])throws IOException
 {try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n;
	while(true)
	{
		n=Integer.parseInt(br.readLine());if(n==42)break;
		System.out.println(n);
	}}catch(Exception e){return;}

}}