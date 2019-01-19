import java.util.*;
class atm
{
  public static void main(String []args)
  {
    double bal,orgbal;
    double cut, amt;
    Scanner in = new Scanner(System.in);
    amt = in.nextDouble();
    bal = in.nextDouble();
    orgbal = bal;
    if(amt%5==0)
    {
      if(amt>=bal)
      {
        System.out.println(bal);
      }
      else
      {
        bal=bal-amt-0.5;
        if(bal<0)
        {
          System.out.println(orgbal);
        }
        else
        {
          System.out.println(bal);
        }
      }
    }
    else
    {
      System.out.println(bal);
    }
  }
}
