import java.util.Scanner;
import java.lang.Integer;

public class Exercicio3{
    public static void main(String[] args){
	int arrSize = Integer.valueOf(args[0]);
	int arr[];
	Scanner s = new Scanner(System.in);
	int i;
	int npares = 0;
	
	if(arrSize < 1){
	    System.out.println("Invalid size");
	    return;
	}

	arr = new int[arrSize];

	for(i = 0; i < arrSize; i++){
	    arr[i] = s.nextInt();
	}

	for(i = 0; i < arrSize; i++){
	    if(arr[i] % 2 == 0){
		npares++;
	    }
	}

	System.out.println("Numero de pares no arr de tamanho " + arrSize + ": " + npares);

	return;
    }
}







