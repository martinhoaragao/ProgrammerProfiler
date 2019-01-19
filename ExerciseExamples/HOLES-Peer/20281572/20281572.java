import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int ans=0;
            char ch[]=br.readLine().trim().toCharArray();
            int l=ch.length;
            for(int i=0;i<l;i++)
                if(ch[i]=='A' || ch[i]=='D' || ch[i]=='O' || ch[i]=='P' || ch[i]=='Q' || ch[i]=='R')ans++;
                else if(ch[i]=='B')ans+=2;

                System.out.println(ans);
        }
    }
}
