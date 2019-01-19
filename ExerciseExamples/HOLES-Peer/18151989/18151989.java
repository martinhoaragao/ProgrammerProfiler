import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s=br.readLine();
			int c=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='A' || s.charAt(i)=='D' || s.charAt(i)=='O' || s.charAt(i)=='P' || s.charAt(i)=='R' || s.charAt(i)=='Q')
				c++;
				if(s.charAt(i)=='B')
				c+=2;
			}
			System.out.println(c);
		}
	}
}