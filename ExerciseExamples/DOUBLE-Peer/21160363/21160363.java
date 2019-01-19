import java.util.Scanner;
class J003 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0;i<t;i++) {
            int n = input.nextInt();
            if (n%2==0) {
                System.out.println(n);
            } else {
                System.out.println(n-1);
            }
        }
    }
}
