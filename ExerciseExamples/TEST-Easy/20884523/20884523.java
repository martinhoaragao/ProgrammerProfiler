import java.util.Scanner;

class Life_Universe_Everything {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[65535];
        int next = 0;
        int i = 0;
        while (true) {
            next = scan.nextInt();
            if (next != 42) {
                array[i] = next;
                i++;
            }
            else
                break;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }
    }
}
