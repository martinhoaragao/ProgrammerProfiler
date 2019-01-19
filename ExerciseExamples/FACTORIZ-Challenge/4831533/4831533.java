import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.BigInteger;

class factor
{
public static void main(String xy[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(in.readLine());
while(t>0)
{
BigInteger n=new BigInteger(in.readLine());

if(n.mod(new BigInteger("2")).compareTo(BigInteger.ZERO)==0)
{
System.out.println(2);
System.out.println(2);
System.out.println(n.divide(new BigInteger("2")));
}

else
{
System.out.println(1);

System.out.println(n);
}
t--;
}
}
}