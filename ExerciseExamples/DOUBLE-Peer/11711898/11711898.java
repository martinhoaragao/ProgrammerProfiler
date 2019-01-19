import java.util.Scanner;
class DoubleStrings {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T--!=0){
			int N=sc.nextInt();
			int count=N;
			if(N%2==1){
				count--;
			}
			System.out.println(count);
		}
	}
}
