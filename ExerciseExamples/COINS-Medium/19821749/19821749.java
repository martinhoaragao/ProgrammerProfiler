import java.io.*;
import java.util.*;

class TestClass {
    public static long find(long n)
    {
     if(n < 12)
        return n;
    return(Math.max(n,find(n/2)+find(n/3)+find(n/4)));
    }
    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
      while(s.hasNext())
      {
        long n = s.nextLong();
        long dollars;
        dollars = find(n);
        System.out.println(dollars);
      }
    }
}
