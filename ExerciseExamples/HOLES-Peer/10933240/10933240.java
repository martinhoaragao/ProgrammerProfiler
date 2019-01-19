import java.io.*;
class  HOLES
{
  public static void main(String []args)throws Exception
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String a;
      char c;
      int t,count=0;
      t=Integer.parseInt(br.readLine());
      while(t-->0)
      {
          count=0;
          a=br.readLine();
          for(int i=0;i<a.length();i++)
          {
              c=a.charAt(i);
              if(c=='A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R')
              count++;
              else if(c=='B') count=count+2;
            }
            System.out.println(count);
        }
    }
}