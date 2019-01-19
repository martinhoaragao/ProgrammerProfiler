import java.io.*;
import java.util.*;



class TREEROOT {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        String[] line;
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int root = 0;
            for (int j = 0; j < n; j++) {


                line = br.readLine().split(" ");
                int id = Integer.parseInt(line[0]);
                int sum_of_chil = Integer.parseInt(line[1]);
                root += id - sum_of_chil;
            }
            System.out.println(root);
        }

    }
}
