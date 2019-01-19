import java.util.Scanner;

class TreeRoot {
    static public void main(String[] args  ) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for ( int t=0; t < T ; ++t ) {
            int N = in.nextInt();

            int sum = 0;
            for ( int n=0; n <N; ++n )
            {
                int v = in.nextInt();
                int cs = in.nextInt();
                sum += v - cs;
            }

            System.out.println(sum);
        }
    }
}