import java.util.*;
class goldcoin
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=10;
    while(t>0)
    {
      long n=sc.nextInt();
      System.out.println(solve(n));
      t--;
    }
  }
  public static long solve(long n)
  {
    long sum=n/2+n/3+n/4;
    if(sum>n)
    return solve(n/2)+solve(n/3)+solve(n/4);
    else
    return n;
  }
} 