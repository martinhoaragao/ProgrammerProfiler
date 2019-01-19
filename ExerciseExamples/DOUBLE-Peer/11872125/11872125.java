
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        int n;
        while(test-->0){
            n=scanner.nextInt();
            if (n%2==0)
                System.out.println(n);
            else 
                System.out.println(n-1);
        }
    }
}
