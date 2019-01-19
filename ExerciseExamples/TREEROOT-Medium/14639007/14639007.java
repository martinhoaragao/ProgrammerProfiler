
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader( System.in ) );
		Scanner scanner = new Scanner(stdin);
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int NumOfNodes = scanner.nextInt();
			int sumOfIDs = 0;
			int sumOfChilders = 0;
			for (int j = 0; j < NumOfNodes; j++) {
				sumOfIDs += scanner.nextInt();
				sumOfChilders += scanner.nextInt();
			}
			
			System.out.println(sumOfIDs-sumOfChilders);
			
		}

	}

}
