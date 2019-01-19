import java.util.Scanner;

class RootOfTheProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int first = 0;
            int second = 0;
            while(n-->0){
                first += s.nextInt();
                second +=s.nextInt();
            }
            System.out.println(first - second);
        }
        return ;
    }
}
