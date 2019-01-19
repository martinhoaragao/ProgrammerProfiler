import java.util.Scanner;

class a {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(true) {
			int t=sc.nextInt();
			if(t!=42) {
				System.out.println(t);
			}else {
				break;
			}
		}
	}

}
