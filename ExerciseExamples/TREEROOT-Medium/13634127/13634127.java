import java.io.InputStreamReader;
import java.util.Scanner;

class RootProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(new InputStreamReader(System.in));
        int t= scan.nextInt();
        while(t > 0){
            t--;
            int n = scan.nextInt();
            int idSums = 0;
            int ids = 0;
            while(n > 0) {
                n--;
                int id = scan.nextInt();
                int idSum = scan.nextInt();
                ids += id;
                idSums += idSum;
            }
            // All id's sum - all given id's sum.
            System.out.println(ids-idSums);
        }
        scan.close();
	}
}