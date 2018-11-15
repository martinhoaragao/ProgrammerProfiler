
import java.util.*;

class ChefBipartite{

    static ArrayList<Edge> ed;
    //static boolean dFlag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int D = sc.nextInt();
            int left[] = new int[n];
            int right[] = new int[n];
            //dFlag = false;
            ed = new ArrayList<Edge>();
            int offset = 0;
            while(m > 0){
                m = connect(left, right, n, m, offset);
                ++offset;
            }
            int i;
            for(i = 0; i < n; i++){
                if(left[i] < d || left[i] > D || right[i] < d || right[i] > D)
                    break;
            }
            if( i < n){
                System.out.println(-1);
            }
            else{
                for(Edge e: ed){
                    System.out.println(e.u+" "+e.v);
                }
            }
        }
    }

    public static int connect(int left[], int[] right, int n, int m, int offset) {
        for(int i = 0; i < n && m > 0; i++){
            left[i]++;
            right[(i + offset) % n]++;
            ed.add(new Edge(i + 1, (i + offset) % n + 1));
            m--;
        }
        return m;
    }
}

class Edge{
    int u,v;
    Edge(int a, int b){
        u = a;
        v = b;
    }
}