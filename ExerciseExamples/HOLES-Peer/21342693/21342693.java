import java.io.*;
class Demo
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int t = Integer.parseInt(str);
    while(t-->0)
    {
      int holes=0;
      int arr[] = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
      str = br.readLine();
      for(int i=0;i<str.length();i++)
      {
         holes+=arr[(int)str.charAt(i)-65];
      }
      System.out.println(holes);
    }
  }
}