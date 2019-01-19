import java.util.Scanner;
class J003 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n =0;
        while (n==0) {
            int x = input.nextInt();
            if (x==42){
                n=1;
            } else {
                System.out.println(x);
            }
        }

    }
}