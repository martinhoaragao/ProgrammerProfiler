import java.util.Scanner;

class treeroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int tot = sc.nextInt(), sum = 0;
            sc.nextLine();

            while (tot-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.nextLine();

                sum += (a - b);
            }

            System.out.println(sum);
        }
    }
}
