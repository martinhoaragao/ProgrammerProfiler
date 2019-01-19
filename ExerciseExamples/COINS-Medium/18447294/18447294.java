import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main
{
  static long coins(int n){
    long p=n/2+n/3+n/4;
    if(p>(long)n)
    return coins(n/2)+coins(n/3)+coins(n/4);
    else
    return (long)n;
  }
    public static void main(String[] args)throws IOException
    {
        Scanner in=new Scanner(System.in);
        StringBuffer st=new StringBuffer();
        int t=0;
        while(in.hasNext()){
          int n=in.nextInt();
          
          long ans=coins(n);
          st.append(ans+"\n");
        }
      System.out.print(st);
    }
}
