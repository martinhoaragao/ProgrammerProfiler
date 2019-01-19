import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testTrial = Integer.valueOf(reader.readLine());
        for (int i = 0; i < testTrial; i++) {
            int numberOfNodes=Integer.parseInt(reader.readLine());
            int root=0;
            for(int j=0;j<numberOfNodes;j++){
                String[] idAndSum=reader.readLine().split(" ");
                int nodeId=Integer.parseInt(idAndSum[0]);
                int sum=Integer.parseInt(idAndSum[1]);
                root+=nodeId-sum;
            }
            System.out.println(root);
        }
    }
}

