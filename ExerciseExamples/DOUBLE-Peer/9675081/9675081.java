import java.util.Scanner;
class Double
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt(),n=0;
    while(t>0)
    {
      n=s.nextInt();
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