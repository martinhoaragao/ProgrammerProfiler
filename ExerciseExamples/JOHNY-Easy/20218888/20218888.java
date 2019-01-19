
import java.util.*;
 class JOHNY {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t,n,k,i,song;
    t=in.nextInt();
    while(--t>=0)
    {
      n=in.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      k=in.nextInt();
      song=a[k-1];
      Arrays.sort(a);
      for(i=0;i<n;i++)
      {
        if(song==a[i])
          break;
      }
      System.out.println(i+1);
    }
  }

}
