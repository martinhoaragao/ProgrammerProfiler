import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      int x=sc.nextInt();
      if(x%2==0)
      System.out.println(x);
      else
      System.out.println(x-1);
      t--;
    }
  }
}
 