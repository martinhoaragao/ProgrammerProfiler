import java.util.Scanner;

class Test{
	public static void main(String []args){
		int number;
		Scanner scanner= new Scanner(System.in);

		while(true){
			number= scanner.nextInt();
			if(number!= 42)
				System.out.println(number);
                        else
                            System.exit(0);
		}
	}
}