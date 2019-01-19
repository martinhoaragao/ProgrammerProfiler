import java.util.Arrays;
import java.util.Scanner;

class UncleJohny {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        short t = keybord.nextShort();
        short i = 0;

        while (i < t) {
            byte n = keybord.nextByte();
            int[] length = new int[n];

            byte j = 0;
            while (j < n) {
                length[j] = keybord.nextInt();
                j++;
            }
            byte k = keybord.nextByte();
            int value = length[k - 1];

            Arrays.sort(length);

            // find the position
            j = 0;
            while (j < n) {
                if (value == length[j])
                    break;
                j++;
            }

            System.out.println(j + 1);
            i++;
        }
    }
}