import java.io.*;
class Hello
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//System.out.println("Enter a no");
	int a=Integer.parseInt(br.readLine());
	System.out.println(a);
}
}	