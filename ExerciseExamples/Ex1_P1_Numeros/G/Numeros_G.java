import java.util.Scanner;

public class Numeros {

	public static void main(String[] args){
		int x,somaPares,contaPares,contaImpares;
		float media;
		
		somaPares = contaPares = contaImpares = 0;

		Scanner in = new Scanner(System.in);
		x = in.nextInt();	

		while(x != 0){ // ler inteiros até que o inteiro lido é um zero
			if(x % 2 == 0){
				contaPares++;
				somaPares += x;
			} 
			else
				contaImpares++;

			x = in.nextInt();
		}

		media = somaPares/contaPares;

		System.out.println("Numeros Pares: " + contaPares + "\nNumeros Impares: " + contaImpares + "\nMedia: "+ media);	

	}

}
