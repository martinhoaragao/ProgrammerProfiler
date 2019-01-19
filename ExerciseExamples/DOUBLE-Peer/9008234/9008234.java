import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner s1=new Scanner(System.in);
  int n,i,j,a;
  a=s1.nextInt();
  for(i=0;i<a;i++)
  {
  n=s1.nextInt();
  if(n%2==0)
  {
    System.out.println(n);
  }
  else
  {
    System.out.println(n-1);
  }
}

}
}