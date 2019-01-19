import java.util.Scanner;
class BinTree{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- != 0){
			int n = s.nextInt(),top = 0;
			int[] id = new int[n], sm = new int[n];
			for(int i = 0;i < n; i++){
				id[i] = s.nextInt();
				sm[i] = s.nextInt();
				top += id[i]-sm[i];
			}
			System.out.println(""+top);
		}
	}
}
