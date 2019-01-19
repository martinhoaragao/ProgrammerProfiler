import java.util.*;

class Solution
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
       int n=sc.nextInt();
       int sum=0;
       for(int i=0;i<n;i++)
       {
       	 int id=sc.nextInt();
       	 int s=sc.nextInt();
       	 sum=sum+id-s;
       }
       System.out.println(sum);
    	
    	
    	t--;
    }
    }

  }
