import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {long n=Long.parseLong(br.readLine());
            
            long sum=0;
            for(int i=0;i<n;i++)
            {
                StringTokenizer st=new StringTokenizer(br.readLine());
                long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            sum=sum+a-b;
            
            }
        
        System.out.println(sum);
        }
    }


}