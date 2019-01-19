import java.util.Scanner;
class duo
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=1 ; i<=T ; i++)
    {
      int N = sc.nextInt();
      if(N%2 == 1)
      N--;
      
      System.out.println(N);
    }
  }
}