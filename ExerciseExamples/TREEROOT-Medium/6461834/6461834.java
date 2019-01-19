import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class TREEROOT {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);


        int T = Integer.parseInt(input.readLine());
        for(int t = 0; t < T; t++) {
            int N = Integer.parseInt(input.readLine());

            int rootNode = 0;
            for(int n = 0; n < N; n++) {
                String[] line = input.readLine().split("\\s+");
                int nodeId = Integer.parseInt(line[0]);
                int childSum = Integer.parseInt(line[1]);

                rootNode += (nodeId - childSum);

            }

            output.println(rootNode);

        }

        output.close();
    }
}
