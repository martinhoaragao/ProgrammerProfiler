import java.lang.*;
import java.math.*;
import java.util.*;
import java.util.Random;
class Factor 
{
  public static void main(String args[]) 
  {
    int t;
    Scanner in = new Scanner(System.in);
    t=in.nextInt();
    BigInteger n,g;
    while(t>0)
    {
      n=in.nextBigInteger();
      Vector v = new Vector(3, 2);
      BigInteger x=new BigInteger("2");//(n.bitLength()-1,new Random());
      //System.out.println(x);
      BigInteger y=x;
      int i=1,k=2,j=1;
      while(j<=10)
      {
      	i++;j++;
      	if(n.equals(new BigInteger("1"))) break;
      	x=((x.pow(2)).subtract(new BigInteger("1"))).mod(n);
      	g=n.gcd((x.subtract(y)).abs());
      	if(!g.equals(new BigInteger("1")) && !g.equals(n))
      	{
      		i=1;
      		y=x=new BigInteger("2");
      		i=1;k=2;
      		n=n.divide(g) ;
      		v.addElement(g);
      	}
      	//System.out.println(x+" "+y);
      	if(i==k)
      	{
      		k=2*i;
      		y=x;
      	}
      }
      if(!n.equals(new BigInteger("1")))
      {
      	System.out.println(v.size()+1);
      	System.out.println(n);
      }
      else
      {
      	System.out.println(v.size()+1);
      }
      Enumeration vEnum = v.elements();
      while(vEnum.hasMoreElements())
         System.out.println(vEnum.nextElement());
      t--;
    }
    in.close();
  }
  
}
