import java.util.*;
class Root{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testc = sc.nextInt();
		for(int i=0;i<testc;i++){
			int n = sc.nextInt();
			int ans = 0;
			for(int j=0;j<n;j++){
				int id = sc.nextInt();
				int sum = sc.nextInt();
				ans = ans + (id-sum);
			}
			System.out.println(ans);
		}
	}

}