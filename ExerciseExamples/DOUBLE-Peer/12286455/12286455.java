import java.util.Scanner;


public class Main{
	
	public static void main(String []args) throws java.lang.Exception{
		
		Scanner in=new Scanner(System.in);
		
		int test=in.nextInt();
		
		while(test>0){
			int hold=in.nextInt();
			if(hold%2==0)
				System.out.println(hold);
			else
				System.out.println(hold-1);
			
			test--;
		}
		
	
	}
}
