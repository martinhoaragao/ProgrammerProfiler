import java.util.Scanner;
import java.lang.*;

public class Main{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0){
			int root = 0;
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				root += in.nextInt();
				root -= in.nextInt();
			}
			System.out.println(root);
		}
	}
	
}