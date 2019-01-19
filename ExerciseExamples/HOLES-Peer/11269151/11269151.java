import java.util.*;
class Solution
{
 public static void main(String [] args)
 {
 	String str = null;
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int count=0;
		str=sc.next();
		str=str.toUpperCase();
                for(int j=0;j<str.length();j++)
		{
			char ch=str.charAt(j);
			if(ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
				count++;
			else if(ch=='B')
				count=count+2;
		}
		System.out.println(count);
  	}
 }
}