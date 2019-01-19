
import java.util.Scanner;

class DoubleStrings {

	public static void main(String[] args) {
		try{
			Scanner s = new Scanner(System.in);
			int count = s.nextInt();
			int var = 0;
			while(count !=var){
				int temp = s.nextInt();
				if(temp%2 == 0)
					System.out.println(temp);
				else
					System.out.println(temp - 1);	
				var++;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
	}

}
