import java.util.Scanner;

class Start{
    public static void main(String []args){
	Scanner reader = new Scanner(System.in);
	while(true){
	 int number = reader.nextInt();
	 if (number == 42)
	 	break;
	 System.out.println(number);
	}
	reader.close();
    }
}