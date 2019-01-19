
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TREEROOT {

    private static int nbrOfNodes;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        int[] roots = new int[testCases];
        for (int index = 0; index < testCases; index++) {
            int idSum = 0, valueSum = 0;
            nbrOfNodes = Integer.parseInt(reader.readLine());
            for (int node = 0; node < nbrOfNodes; node++) {
                StringTokenizer tokenz = new StringTokenizer(reader.readLine());
                idSum += Integer.parseInt(tokenz.nextToken());
                valueSum += Integer.parseInt(tokenz.nextToken());
            }
            roots[index] = idSum - valueSum;
        }
        for (int root : roots) {
            System.out.println(root);
        }

    }


}
