import java.io.*;
class HOLES {
   public static void main(String args[]) throws IOException
   {
	   BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	   int T=Integer.parseInt(in.readLine());
	   while(T>0)
	   {
		   String s=in.readLine();
		   int c=0;
		   char ch=' ';
		   for(int i=0;i<s.length();i++)
		   {
			 ch=s.charAt(i);
			 if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' || ch=='R')
				 c++;
			 else if(ch=='B')
				 c+=2;
		   }
		   System.out.println(c);
		   T--;
	   }
   }
}