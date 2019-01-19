import java.util.*;

class johny{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t>0)
    {
      int n = in.nextInt();
      long arr[] =  new long[n+1];
      for(int i=1;i<=n;i++)
      {
        arr[i] = in.nextLong();
      }
      long favLength = arr[in.nextInt()];

      Arrays.sort(arr);

      for(int i=1;i<=n;i++)
      {
        if(arr[i] == favLength)
        {
          System.out.println(i);
          break;
        }
      }
      t--;
    }
  }
}
