import java.util.Scanner;
 class Test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        while(n!=42) {
        System.out.println(n);
        n=scan.nextInt();
        }
    }
}