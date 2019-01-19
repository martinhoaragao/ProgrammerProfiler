import java.io.*;

class RootCause
{
	public static void main(String ar[])throws IOException
	{
	  BufferedReader bis=new BufferedReader(new InputStreamReader(System.in));
	  
	  int t=Integer.parseInt(bis.readLine());
	  
	  for(int i=0;i<t;i++)
	  {
	     int x=Integer.parseInt(bis.readLine());
		 
		 
		 int node=0;
		 int sum=0;
		 
		 for(int j=0;j<x;j++)
		 {
		 
	        String s=bis.readLine();
            String pot[]=s.split("\\s+");

          node=node+(Integer.parseInt(pot[0]));
          int y=Integer.parseInt(pot[1]);

          if(y>0)
            {
			sum=sum+y;
			}		  
		 
		 }
	  
	  System.out.println(node-sum);
	  }
	
	
	}



}