import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<=n;i++) {
                list.add(scanner.nextInt());
            }
            int value = list.get(scanner.nextInt()-1);
            Collections.sort(list);
            System.out.println(Collections.binarySearch(list, value)+1);
        }
    }
}
