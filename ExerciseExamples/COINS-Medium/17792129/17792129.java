import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
  public static long ans(long num){
        long sum = num/2 + num/3 + num/4;
       if(sum>num)
         return ans(num/2)+ans(num/3)+ans(num/4);

	else
	return num;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String b = sc.nextLine();
      long i = Long.parseLong(b);
      System.out.println(ans(i));
    }

	}
}
