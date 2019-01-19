import java.io.*;
class ROOT
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            int sum2=0;
            for(int j=0;j<n;j++)
            {
                String[] input = br.readLine().split(" ");
                int id = Integer.parseInt(input[0]);
                int sum= Integer.parseInt(input[1]);
                sum2+=id-sum;
            }
            System.out.println(sum2);
        }
    }
}

            