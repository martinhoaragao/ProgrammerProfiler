import java.util.*;
import java.io.*;
class abc{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
String str;
int len,count=0;

for(int i=0;i<t;i++)
{   char c;
    count=0;
	str=br.readLine();
	len=str.length();
	for(int j=0;j<len;j++)
	{c=str.charAt(j);
     if(c=='A'||c=='D'||c=='O'||c=='P'||c=='R'||c=='Q')
		 count=count+1;
	 else if (c=='B')
		 count=count+2;
	 else
		 count=count+0;
			

	}System.out.println(count);
}
}
}