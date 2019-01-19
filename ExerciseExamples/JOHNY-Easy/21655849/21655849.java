import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-- > 0)
        {
            int n = in.nextInt();
            int[] arr = new int[n];
            int i;
            for(i=0; i <n;i++)
            {
                arr[i] = in.nextInt();
            }
            int k = in.nextInt();
            int x= arr[k-1],count=0;
            for(i=0;i<n;i++)
            {
                if(arr[i] < x)
                {
                    count++;
                }

            }
            System.out.println(count+1);
        }
    }
}