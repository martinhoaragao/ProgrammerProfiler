
import java.util.Scanner;

class First {
	  public static void main(String[] arg) 
	  {
		  
		Scanner s=new Scanner(System.in);
	 
	 int t=s.nextInt();
	 for(int i=0;i<t;i++)
	 {
	     int sum=0;
	     
	     char []ch=s.next().toCharArray();
	     for(int j=0;j<ch.length;j++)
	     {
	         if(ch[j]=='A'||ch[j]=='D'||ch[j]=='O'||ch[j]=='P'||ch[j]=='Q'||ch[j]=='R')
	         sum++;
	         else if(ch[j]=='B')
	         sum+=2;
	     }
	     System.out.println(sum);
	 }
	 s.close();
	  }
	}