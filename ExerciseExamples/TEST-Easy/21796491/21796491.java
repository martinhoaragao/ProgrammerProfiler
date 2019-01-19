import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int i;
		while(scr.hasNext())
		{
			if((i=scr.nextInt())!=42)
				System.out.println(i);
			else
				break;
		}
		
	}
}
