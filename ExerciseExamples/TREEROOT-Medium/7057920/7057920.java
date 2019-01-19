import java.util.*;

/**
 * Created by s147010 on 31-May-15.
 */
public class Main {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfNodes = scanner.nextInt();
            int id = 0;
            int field = 0;
            for(int j=0; j<numberOfNodes; j++){
                id+= scanner.nextInt();
                field+= scanner.nextInt();
            }
            System.out.println(id-field);
        }
    }
}
