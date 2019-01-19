import java.util.*;
class Hole
{
public static void main(String[] args)  
{
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		String str=sc.next(); 
		char c[]= str.toCharArray();
		int count1=0;
		for(int j=0;j<c.length;j++)
		{
if(c[j]=='A'||c[j]=='D'||c[j]=='O'||c[j]=='P'||c[j]=='Q'||c[j]=='R')
		{
			count1++;
		}
		if(c[j]=='B')
		count1=count1+2;
		}
		System.out.println(count1);
	}
	
	
}
}
