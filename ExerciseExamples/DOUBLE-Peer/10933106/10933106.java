import java.util.*;
class DOUBLE
{
  public static void main(String []args)throws Exception
  {
      Scanner sc=new Scanner(System.in);
      int t,n;
      t=sc.nextInt();
      while(t-->0)
      {
          n=sc.nextInt();
          System.out.println((n%2==0? n : n-1));
        }
    }
}