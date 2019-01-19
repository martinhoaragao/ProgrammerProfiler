import java.util.Scanner;

class RootOfTree {
	public static void main(String args[]){
		int t;
		Scanner in = new Scanner(System.in);
		
		t = in.nextInt();
		while(t-->0){
			int n,counter=0;
			n = in.nextInt();
			
			while(n-->0){
				counter+= in.nextInt();
				counter-= in.nextInt();
			}
			
			System.out.println(counter);
		}
	}
}
