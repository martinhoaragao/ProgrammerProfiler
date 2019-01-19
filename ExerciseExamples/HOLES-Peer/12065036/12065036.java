import java.util.*;
import java.lang.*;
class HOLES
{
    public static void main(String[] args) 
    {
        int temp,t,i=1;
        Scanner s = new Scanner(System.in);
		t=s.nextInt();
		while(i<=t)
		{
		String str=s.next();
		int l=str.length();
		int holes=0;
		for(int j=0;j<=l-1;j++)
		{
		if((str.charAt(j)=='A')||(str.charAt(j)=='D')||(str.charAt(j)=='O')||(str.charAt(j)=='P')||(str.charAt(j)=='Q')||(str.charAt(j)=='R'))
		holes=holes+1;
		else if(str.charAt(j)=='B')
		holes=holes+2;
	    
		}
		System.out.println(holes);
		i=i+1;
		}
        
		}}