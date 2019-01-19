import java.util.Scanner;

class TREEROOT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t-->0){
            int n =s.nextInt();
            int root=0;
            while (n-->0) {
                int k = s.nextInt();
                int m =s.nextInt();
                root=root+k-m;
            }
            System.out.println(root);
        }
    }
}