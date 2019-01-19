import java.util.*;

class Test {
    public static void main(String arg[]) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t, i, k, x, j;
        t = s.nextInt();
        for(; t>0; t--)
        {
            int n = s.nextInt();
            int a[] = new int[n];
            for(i=0; i<n; i++)
            {
                a[i] = s.nextInt();
            }
            
            int ans[] = new int[n];
            for(i=0; i<n; i++)
            {
                ans[i] = i+1;
            }
            
            for(i=n-1; i>=0; i--)
            {
                k = a[i];
                x=ans[i-k];
                if(k!=0)
                {
                    for(j=i-k; j<=i-1; j++)
                    {
                       ans[j] = ans[j+1];
                    }
                    ans[i]=x;
                }
            }
            for(i=0; i<n; i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}