import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
        int n=sc.nextInt();
        int pl[]=new int[n];
        for(int i=0;i<n;i++)
        {
            pl[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int kl=pl[k-1];
        Arrays.sort(pl);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(pl[i]==kl)
            {
                ans=i;
            }
        }
        ans=ans+1;
        System.out.println(ans);
        }
    }
    
}
