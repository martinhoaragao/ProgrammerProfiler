import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    int i,j,k,l,m,n;
    for(l=1;l<=t;l++)
    {
      n = input.nextInt();
      int[] a = new int[n];
      for(i=0;i<a.length;i++)
        a[i] = input.nextInt();
      k = input.nextInt();
      int g = a[k-1];
      sort(a);
      for(i=0;i<a.length;i++)
      {
        if(a[i]==g)
          System.out.println(i+1);
      }
    }
  }
  private static void sort(int[] a)
  {
    int n = a.length;
    int i,j,temp;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
}