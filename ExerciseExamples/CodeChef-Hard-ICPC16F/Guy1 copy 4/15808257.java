import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int d = scan.nextInt();
            int D = scan.nextInt();
            if(n*d<=m && m<=n*D)
            {
                int deg[] = new int[n+1];
                int all = m/n;
                int rem = m%n;
                for(int i=1;i<=n;++i)
                {
                    deg[i] = all;
                    if(i<=rem)
                        ++deg[i];
                }
                for(int i=1;i<=n;++i)
                {
                    int idx = i;
                    int currdeg = 0;
                    while(currdeg<deg[i])
                    {
                        System.out.println(i+" "+idx);
                        idx++;
                        if(idx==n+1)
                            idx = 1;
                        currdeg++;
                    }
                }
            }
            else System.out.println(-1);
        }
    }
}