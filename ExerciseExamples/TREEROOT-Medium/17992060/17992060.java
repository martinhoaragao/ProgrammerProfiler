import java.util.*;
import java.io.*;

	public class Main 
	{
     public static void main(String[] args) 
     {
    	 
    	 Scanner sc=new Scanner(System.in);
    	 PrintWriter w=new PrintWriter(System.out);
    	 int t=sc.nextInt();
    	 
		   while(t-->0)
		   {
			   int n=sc.nextInt();
			    int  idd=0,summ=0;
			   
			  for(int i=0;i<n;i++)
			   {
				   int id,sum;
				   id=sc.nextInt();
				   sum=sc.nextInt();
				   idd+=id;
				   summ+=sum;
			   }
			  w.println(idd-summ);
			   
			   
		   }
    	 w.flush();
	}	
	}
