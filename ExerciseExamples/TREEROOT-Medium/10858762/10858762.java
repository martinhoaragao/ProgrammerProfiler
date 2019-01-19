import java.util.*; 
import java.io.*; 
class GeeksforGeeks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt(),i,j;
        while(t-->0)
        {
            int n=sc.nextInt();
            int root=0;
            while(n-->0)
            {
                int id=sc.nextInt(),sum=sc.nextInt();
                root+=id-sum;
            }
            out.println(root);
        }
        out.flush();
    }
}