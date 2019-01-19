import java.util.*;
 class Main {
public static void main(String []args){
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int i=0;i<t;i++)
	{
   	String a=in.next();
   	int h=0;
   	int n=a.length();
   	for(int j=0;j<n;j++)
   	{
   	if(a.charAt(j)=='B')
   	{
   	h+=2;
   	}
   	else if(a.charAt(j)=='A'||a.charAt(j)=='D'||a.charAt(j)=='O'||a.charAt(j)=='Q'||a.charAt(j)=='R'||a.charAt(j)=='P') 	
   	{
   	h+=1;
   	}
   	}
   	System.out.println(h);
   	}
   	}
   	}
   	

 