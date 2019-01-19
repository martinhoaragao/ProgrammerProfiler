import java.util.*;
import java.io.*;
import java.math.*;
	
class main
{
	 public static void main(String args[]) throws Exception
 	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(br.readLine());
		 for(int sn=1;sn<=t;sn++)
		 {
			 int temp=0;
			 String str=br.readLine();
			 for(int i=0;i<str.length();i++){
				 char c=(str.charAt(i));
				 if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
					 temp+=1;
				 if(c=='B')
					 temp+=2;
			 }
			 System.out.println(temp);
		 }
	}
}