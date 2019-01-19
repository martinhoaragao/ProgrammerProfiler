import java.util.*;
class Main
{
  public static void main(String[] args) 
  {
    Scanner in=new Scanner(System.in);
    short t;
    int i;
    t=in.nextShort();
    while(t!=0)
    {
      String s=new String();
      String x=new String("ADOPQR");
      s=in.next();
      int count=0;
      for(i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='B')
        {
          count=count+2;
        }
        else if(x.indexOf(s.charAt(i))>=0)
        {
          count++;
        }
      }
      System.out.println(count);
      t--;
    }
  }
}