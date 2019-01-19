import java.util.*;
import java.lang.*;
import java.io.*;
//"A", "D", "O", "P", "R"
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		    int count =0;
		    String str = sc.next();
		    int l =  str.length();
		    for(int j=0;j<l;j++)
		    {
		        //char ch = str.charAt(i);
		        //System.out.print(ch);
		        if(str.charAt(j)=='B')
                {
                    count=count+2;
                }
                else if(str.charAt(j)=='A')
                {
                    count++;
                }
                else if(str.charAt(j)=='D')
                {
                    count++;
                }
                else if(str.charAt(j)=='O')
                {
                    count++;
                }
                else if(str.charAt(j)=='P')
                {
                    count++;
                }
                else if(str.charAt(j)=='Q')
                {
                    count++;
                }
                else if(str.charAt(j)=='R')
                {
                    count++;
                }
		    }
		    System.out.println(count);
		}
	}
}
