import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int testCases=sc.nextInt();
int number;
for(int i=0;i<testCases;i++){
	number=sc.nextInt();
	if (number%2==0){System.out.println(number);}else {System.out.println(((number-1)));}
	
	
}
	}

}
