
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class JOHNY {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for(int j=0;j<n;j++){
                A.add(s.nextInt());
            }
            int k = s.nextInt();
            int a = A.get(k-1);
            Collections.sort(A);
            System.out.println(A.indexOf(a)+1);
        }
    }
}
