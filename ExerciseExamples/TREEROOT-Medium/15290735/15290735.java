import java.util.Scanner;

class Start {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int z=0;
			while(n-->0){
				int a=sc.nextInt();
				int b=sc.nextInt();
				z+=(a-b);
			}
			System.out.println(z);
		}

			}
}
