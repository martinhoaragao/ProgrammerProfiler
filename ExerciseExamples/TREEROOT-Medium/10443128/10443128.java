import java.util.Scanner;

class Root_Of_Problem {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int test=in.nextInt();
        for(int i=0;i<test;i++)
        {
            int root=0;
            int n=in.nextInt();
            for(int j=0;j<n;j++)
            {
                int id=in.nextInt();
                int sum=in.nextInt();
                root+=id-sum;
            }
            System.out.println(root);
        }
    }
}