//import java.util.*;
import java.math.*;
import java.io.*;

class Chef2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		//Scanner sc =new Scanner(System.in);
		//int a = sc.nextInt();
        for(int i=0; i<a;i++)
        {
            int n = Integer.parseInt(br.readLine());
			if(n%2==0)System.out.println(n);
			else System.out.println(n-1);
			
        }
	}
}