import java.util.Scanner;
class Binary { 
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt() , n ,sum1,sum2;
        while(0<T--)  {
            n=sc.nextInt();
            sum1=sum2=0;
            while(0<n--) {
                sum1+=sc.nextInt();
                sum2+=sc.nextInt();
            }
            System.out.println(sum1-sum2);
        }
    }
}
    