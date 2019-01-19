import java.io.*;
 
class maa_ka_loda
{
	public static void main(String ar[]) throws IOException
	{
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	  
	  int t=Integer.parseInt(in.readLine());
	  
	  for(int i=0;i<t;i++)
	  {
	     int x=Integer.parseInt(in.readLine());
		 
		 
		 int node=0;
		 int sum=0;
		 
		 for(int j=0;j<x;j++)
		 {
		 
	        String s=in.readLine();
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
