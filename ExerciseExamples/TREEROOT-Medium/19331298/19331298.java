import java.util.Scanner;
class RootOfTheProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0){
            int root = 0;
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; ++i){
                root = root + sc.nextInt();
                root = root - sc.nextInt();
            }
            System.out.println(root);
            sc.nextLine();
        }
    }
}
 