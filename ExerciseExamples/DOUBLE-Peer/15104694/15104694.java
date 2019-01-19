import java.util.Scanner;

class codechef{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long n;
        while(t-->0){
            n=s.nextLong();
            System.out.println(n-n%2);
        }
    }
}