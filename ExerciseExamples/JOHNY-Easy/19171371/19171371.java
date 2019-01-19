import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int T;
        Scanner reader = new Scanner(System.in);
        T=reader.nextInt();
        int ans[]=new int[T];
        for(int j=0;j<T;j++)
            ans[j]=0;
        int i=0;
        while (i<T)
        {
            int n=reader.nextInt();
            int A[]=new int[n];
            for(int j=0;j<n;j++)
                A[j]=reader.nextInt();
            int pos=reader.nextInt();
            int uncle_johny=A[pos-1];
            Arrays.sort(A);
            for(int j=0;j<n;j++)
            {
                if(A[j]==uncle_johny)
                {
                    ans[i]=j+1;
                    break;
                }
            }
            i++;
        }
        for(int j=0;j<T;j++)
            System.out.println(ans[j]);
    }
}
