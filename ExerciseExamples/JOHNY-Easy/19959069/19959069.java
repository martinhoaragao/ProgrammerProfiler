import java.util.Arrays;
import java.util.Scanner;

class Johny {
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(;t>0;t--){
			int n = sc.nextInt();
			int s[] = new int[n];
			for(int i=0;i<n;i++)
				s[i]=sc.nextInt();
			int k = sc.nextInt();
			int len = s[k-1];
			Arrays.sort(s);
			for(int i=0;i<n;i++){
				if(s[i]==len){
					System.out.println(i+1);
				}
			}
		}
	}
}
