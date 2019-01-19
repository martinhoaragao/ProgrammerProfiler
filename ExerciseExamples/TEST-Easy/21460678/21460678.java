import java.util.Scanner;
class Ideone{
	public static void main (String []args){
		Scanner in=new Scanner(System.in);
		int a = in.nextInt() ;
		while (a!=42)
		{
			System.out.println(+a);
			a = in.nextInt();
		}
	}
}