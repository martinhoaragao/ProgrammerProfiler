import java.io.*;
class bed
{  public static void main(String args[])throws IOException
   {  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String nStr=br.readLine();
      int n=Integer.parseInt(nStr);
      System.out.println(n);
   }
}