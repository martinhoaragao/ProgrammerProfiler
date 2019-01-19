import java.util.*;
class RootOfTheProblem {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int t=scanner.nextInt();
		while(t-->0){
			int num1=0,num2=0;
			int n=scanner.nextInt();
			for(int i=0;i<n;i++){
				num1+=scanner.nextInt();
				num2+=scanner.nextInt();
			}
			System.out.println(num1-num2);
		}
	}
}