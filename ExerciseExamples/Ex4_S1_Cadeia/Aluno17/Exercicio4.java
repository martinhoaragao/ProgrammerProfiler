import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;

public class Exercicio4{
    public static void main(String[] args){
	String sub = args[0];
	String maj = args[1];
	int indice = 0;
	int conta = 0;
	
	indice = maj.indexOf(sub,indice);
	while(indice != -1){
	    conta++;
	    indice++;
	    indice = maj.indexOf(sub,indice);
	}

	System.out.print("Numero de ocorrencias da string " + sub + " na string " + maj + ": ");
	System.out.println(conta);
	
    }
}
