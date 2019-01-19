import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		byte t;
		int hole;
		t = sc.nextByte();
		if(t<=40)
		{
		    while(t>0)
		    {
		        String s = new String();
		        s = sc.next();
		        hole=0;
		        if(s.length()<100)
		        {
		            for(byte i=0;i<s.length();i++)
		            {
		                char c = s.charAt(i);
		                if(c=='B')
		                    hole+=2;
		                else if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
		                    hole++;
		            }
		            System.out.println(hole);
		            t--;
		        }
		        
		    }
		}
	}
}
