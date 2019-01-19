import java.io.IOException;
import java.io.BufferedReader;;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
  PrintWriter pw = new PrintWriter(System.out);
  //code
  int t = Integer.parseInt(br.readLine());
  int[] ans = new int[t];
  int i=0;
  while(i<t)
  {
   int n = Integer.parseInt(br.readLine());
   if(n%2!=0)n--;
   ans[i]=n;
   i++;
  }

  i=0;while(i<t){ pw.println(ans[i]);pw.flush();i++; }

 }
}

