import java.util.Scanner;

class NOV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        double t = sc.nextDouble();
        if(s%5 == 0 && (t-s - 0.5) > 0.0)
            System.out.println(String.format("%.2f",(t-s - 0.5)));
        else
            System.out.println(String.format("%.2f", t));
    }
}
