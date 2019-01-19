import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int numberOfTestcase = reader.nextInt();
		for(int i=0; i<numberOfTestcase; i++){
			long lenghtString = reader.nextLong();
			if( lenghtString%2 == 0){
				System.out.println(lenghtString);
			} else {
				System.out.println(lenghtString-1);
			}
		}
	}

}
