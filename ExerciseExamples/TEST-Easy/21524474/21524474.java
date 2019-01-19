import java.util.Scanner;

public class Main {
	
	public static void displayNumbersBefore42(int number)
	{
				
			System.out.println(number);
			
		
	}
	

public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);

	
	while(sc.hasNext())
	{
	
	int number=sc.nextInt();	
   
	if(number == 42)
		break;
	
	displayNumbersBefore42(number);
	

	}
	
}	
	

}