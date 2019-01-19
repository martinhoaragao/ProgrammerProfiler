import java.util.Scanner;

class Str
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt(),n=0;
    while(t>0)
    {
      n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println(n);
      }
      else
      {
        System.out.println(n-1);
      }
      t--;
    }
  }
}
