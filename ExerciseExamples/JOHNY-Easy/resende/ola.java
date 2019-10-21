import java.util.Scanner;
import java.util.ArrayList;
class  Main {
    public static void main(String[] args) {
        int n_tests;
        ArrayList<Integer> array;
        int number_array;
        int current_k;
        int value;
        int count;
        Scanner in = new Scanner(System.in);
        array = new ArrayList<Integer>();
        n_tests = in.nextInt();
        for (int i = 0; i < n_tests; i++) {
            number_array = in.nextInt();
            for (int j = 0; j < number_array; j++) {
                array.add(in.nextInt());
            }
            current_k = in.nextInt();
            value = array.get(current_k - 1);
            count = 0;
            for (int it : array) {
                if (it<value)
                    count++;
            }
            System.out.println(count + 1);
            array.clear();
        }
    }
}