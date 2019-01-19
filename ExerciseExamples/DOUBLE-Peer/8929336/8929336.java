import java.util.Scanner;
class DoubleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int[] value = new int[test_cases];
        for(int i=0;i<test_cases;i++)
        {
            value[i]=sc.nextInt();
        }
        for(int i=0;i<test_cases;i++)
        {
            if(value[i]%2==0)
            {
                System.out.println(value[i]);
            }
            else
            {
                System.out.println(value[i]-1);
            }
        }
    }
}
