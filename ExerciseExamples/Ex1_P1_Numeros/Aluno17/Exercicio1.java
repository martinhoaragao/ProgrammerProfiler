import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
	int npares = 0;
	int nimpares = 0;
	int somadepares = 0;
	int atual = 0;
	Scanner s = new Scanner(System.in);

	atual = s.nextInt();
	while(atual != 0){
	    if((atual % 2) == 0){
		npares++;
		somadepares += atual;
	    }
	    else{
		nimpares++;
	    }
	    atual = s.nextInt();
	}

	System.out.println("Numero de pares: " + npares);
	System.out.println("Numero de impares: " + nimpares);
	if(npares > 0){
	    System.out.println("Media dos pares: " + (somadepares / npares));
	}
	else{
	    System.out.println("Media dos pares: NaN");
	}
    }
}
