import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.Integer;

public class Exercicio2{
    public static void main(String[] args){
	int limite = Integer.valueOf(args[0]);
	int nidades = Integer.valueOf(args[1]);
	int somadeidades = 0;
	int i = 0;
	int atual = 0;
	Scanner s = new Scanner(System.in);
	StringBuilder results = new StringBuilder();

	if(nidades < 1){
	    System.out.println("Nao ha idades");
	}
	
	results.append("Idades maiores do que ").append(limite).append(": ");
	while(i < nidades){
	    atual = s.nextInt();
	    somadeidades += atual;
	    if(atual > limite){
		results.append(atual).append(" ");
	    }
	    i++;
	}

	results.append("\nMedia de idades: ").append((float)somadeidades / nidades);

	System.out.println(results.toString());
    }
}
	    
