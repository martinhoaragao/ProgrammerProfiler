import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int sum1=0;
            int sum2=0;
            for(int j=0;j<n;j++){
                int id=sc.nextInt();
                int sum=sc.nextInt();
                sum1+=id;
                sum2+=sum;
            }
            System.out.println(sum1-sum2);
        }
    }
}
