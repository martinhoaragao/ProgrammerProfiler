
import java.util.Scanner;

class Double {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();
		int[] array=new int[10000];
		while(x!=0)
		{
			int y=input.nextInt();
			if(y%2==0)
				System.out.println(y);
			else
				System.out.println(y-1);
			x--;
		}
	}
}
		
