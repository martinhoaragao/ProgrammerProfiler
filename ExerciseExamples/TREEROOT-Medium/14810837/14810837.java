
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Main {

    static BufferedReader in;

    static void testcase(int t) throws IOException {
        int n = Integer.parseInt(in.readLine().trim());
        int root = 0;
        for (int i = 0; i < n; i++) {
            String row[] = in.readLine().trim().split(" ");
            root += Integer.parseInt(row[0]) - Integer.parseInt(row[1]);
        }
        System.out.println(root);
//        int[] nodes = new int[31];
//        Arrays.fill(nodes, -1);
//        for (int i = 0; i < n; i++) {
//            String row[] = in.readLine().trim().split(" ");
//            nodes[Integer.parseInt(row[0])] = Integer.parseInt(row[1]);
//        }
//        int remainN = n;
//        while (remainN !=1) {
//            for (int k = 0; k < 31; k++) {
//                if(nodes[k] != 0 || nodes[k] == -1) continue;
//                int currNode = nodes[k];
//                for (int i = 0; i < 31; i++) {
//                    if(nodes[i] != 0 || nodes[i] == -1) continue;
//                    for (int j = 0; j < 31; j++) {
//                        if(nodes[j] != 0 || nodes[j] == -1) continue;
//                        if(currNode == nodes[i]+nodes[j]){
//                            nodes[k] = 0;
//                            nodes[i] = nodes[j] = -1;
//                            remainN--;
//                        }
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < 31; i++) {
//            if(nodes[i] == -1) continue;
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine().trim());
        for (int i = 0; i < t; i++) {
            testcase(i);
        }
    }
}
