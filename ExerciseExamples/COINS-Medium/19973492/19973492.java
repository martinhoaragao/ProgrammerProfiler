import java.util.*;

class Test
{
   public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);	
	while(in.hasNext())
	{
		long n = in.nextLong();
		System.out.println(processRequest(n));		
	}	
	in.close();   
   }
   
   private static long processRequest(long n)
   {
   	if(n < 12)return n;
   	return processRequest(n/2)+processRequest(n/3)+processRequest(n/4);
   }
}

