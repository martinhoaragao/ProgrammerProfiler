import java.util.*;

class Codechef{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int T=in.nextInt();
        while(T!=0)

        {
            int Sum=0;
            int N=in.nextInt();

            for(int i=0;i<N;i++)
            {
                int a=in.nextInt();
                int b=in.nextInt();
                Sum=Sum+(a-b);
            }
            System.out.println(Sum);
            T--;
        }
    }
}