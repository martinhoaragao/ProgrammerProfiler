import java.util.Scanner;
 
class TREEROOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=0; i < T; i++) {
            int N = input.nextInt();
            int id_total = 0;
            int child_id_total = 0;
            for(int j = 0; j < N; j++) {
                id_total += input.nextInt();
                child_id_total += input.nextInt();
            }
            System.out.println(id_total - child_id_total);
        }
    }
}