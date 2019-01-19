/**
 * Created by sathish on 5/2/17.
 */
import java.io.*;

 class root {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int id=0,sum=0;
            for(int i=0;i<n;i++)
            {
                String s[]=br.readLine().split(" ");
                id+=Integer.parseInt(s[0]);
                sum+=Integer.parseInt(s[1]);

            }
            pw.println(id-sum);


        }
        pw.flush();

    }
}
