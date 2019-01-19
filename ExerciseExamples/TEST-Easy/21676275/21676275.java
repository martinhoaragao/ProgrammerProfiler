import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Start {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 42) {
                break;
            }
            else {
                list.add(n);
            }
        }

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}