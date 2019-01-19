import java.util.*;

class johnny{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int j=0;j<n;j++)
      {
        a[j] = sc.nextLong();
      }
      int k = sc.nextInt();
      long x = a[k-1];
      //System.out.println("x is " + x);
      Arrays.sort(a);
      for(int j=0;j<n;j++)
      {
        if(a[j]== x)
        {
          System.out.println(j+1);
          break;
        }
      }
    }
  }
}
