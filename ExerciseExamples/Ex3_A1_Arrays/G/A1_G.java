import java.util.Scanner;

public class JavaTeste {

    public  static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int conta=0,input;	
    int[] numbers = new int[n];

        for(int i = 1 ; i<=num ; i++){
		input = in.nextInt();
        numbers[i] = input;
		if(input % 2 == 0) conta++;
	}
	
	System.out.println("Foram lidos "+ String.valueOf(conta)+ " numeros pares");

    }

}
