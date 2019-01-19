import java.util.Scanner;
class SmallFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0 ; i < testCases ; i++)
        {
            int num = sc.nextInt();
            if(num%2==0) System.out.println(num);
            else System.out.println(num-1);
        }

    }
}