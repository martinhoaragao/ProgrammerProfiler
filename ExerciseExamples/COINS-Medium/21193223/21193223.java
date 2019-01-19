import java.util.*;

class Solution
{

  
   
  static long maxv(long n)
  {
  	long s=n/2+n/3+n/4;
  	if(s>n)
  	{
  		return maxv(n/2)+maxv(n/3)+maxv(n/4);
  	}
  	return n;
  } 

  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=10;
    while(t-->0)
    {
    long n=sc.nextInt();
    System.out.println(maxv(n));
    }
  }
}