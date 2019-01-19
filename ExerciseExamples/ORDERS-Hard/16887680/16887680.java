import java.util.Scanner;

/**
 * https://www.codechef.com/problems/ORDERS
 */
class OrderingSoldiers {
    static int[] indexTree = new int[30000000];

    static int ceilPow2;

    public static void initTree(int n){
        for(ceilPow2 = 1;ceilPow2 < n;ceilPow2 *= 2);
        int i = 0;
        for(; i < n; i++) indexTree[ceilPow2 + i] = 1;
        for(; i < ceilPow2; i++) indexTree[ceilPow2 + i] = 0;
        for(int j= ceilPow2 - 1;j>0;j--) indexTree[j] = indexTree[2 * j] + indexTree[2 * j + 1];
    }

    public static int getRank(int insertionPosition){
        int root = 1;
        while(root < ceilPow2){
            indexTree[root]--;
            if(insertionPosition <= indexTree[2 * root]) root = 2 * root;
            else { insertionPosition -= indexTree[2 * root];root = 2 * root + 1;}
        }
        indexTree[root] = 0;
        return root - (ceilPow2 - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] soldiers = new int[n];
            for(int i = 0;i<n;i++){
                soldiers[i] = s.nextInt();
            }
            initTree(n);
            for(int j = n-1;j>= 0 ; j--) {
                soldiers[j] = getRank((j+1) - soldiers[j]);
            }
            System.out.print(soldiers[0]);
            for(int i = 1;i<soldiers.length;i++){
                System.out.print(" " + soldiers[i]);
            }
            System.out.println();
        }
    }
}
