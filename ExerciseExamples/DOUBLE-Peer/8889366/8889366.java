import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int InpLen, n=s.nextInt();
		int output[] = new int[n];
		for(int i=0;i<n;i++){
			InpLen = s.nextInt();
			output[i] = InpLen-(InpLen%2);
		}
		for(int x:output)
			System.out.println(x);
	}

}
