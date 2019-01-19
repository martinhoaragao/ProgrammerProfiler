import java.util.Scanner;
class try1{
	public static void main(String []args){
		
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		System.out.println(a);
		
		while(a!=42){
			a = in.nextInt();
			if(a!=42)
			System.out.println(a);
		}
	
	}
}