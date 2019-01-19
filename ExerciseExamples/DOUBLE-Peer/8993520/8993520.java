import java.util.Scanner;
class Dumb_game {
	public static void main(String args[]){
		Scanner kb=new Scanner(System.in);
		int test=kb.nextInt();
		for(int i=1;i<=test;i++){
			int a=kb.nextInt();
			if(a%2==0)
				System.out.println(a);
			else
				System.out.println(a-1);
		}
	}
}
