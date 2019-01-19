/*Code Created by solver_flash(161B237) */
import java.util.*;
class Holes
{
	public static void main(String args[])
 	{
		 Scanner scn=new Scanner(System.in);
		 int t=scn.nextInt();
		 while(t-->0)
		 {
			 int temp=0;
			 char c=' ';
			 StringBuilder str=new StringBuilder(scn.next());
			 for(int i=0;i<str.length();i++)
			 {
				c=str.charAt(i);
				 if(c=='A'||c=='D'||c=='O'||c=='P'||c=='Q'||c=='R')
					 temp+=1;
				 if(c=='B')
					 temp+=2;
			 }
			 System.out.println(temp);
		 }
	}
} 