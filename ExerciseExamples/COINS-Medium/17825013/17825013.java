import java.util.*;
class Main 
{
  public static long check(long n)
  {
    long x=n/2+n/3+n/4;
    if(x>n)
    {
      return check(n/2)+check(n/3)+check(n/4);
    }
    else
    {
      return n;
    }
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    while(in.hasNext())
    {
      long n=in.nextLong();
      long max=check(n);
      System.out.println(max);
    }
    in.close();
  }
} 