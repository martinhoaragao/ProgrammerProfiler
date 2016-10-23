import java.util.Scanner;

public class Exercicio1 {
    
    public static void main (String[] args) {
        
        int soma = 0;
        int pares = -1;
        int impares = 0;
        float media = 0;
        int buf;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira uma sequencia de numeros, e acabe essa sequencia com 0:\n");
        
        do {
               
               buf = input.nextInt();
            
                if((buf % 2 == 0)) {
                    pares++;
                    soma += buf;
                } else {
                    impares++;
                }
        
        } while(buf != 0);
        
        if(pares != 0 && soma != 0)
            media = (soma) / (pares);
        else 
            media = 0;
            
        input.close();
        System.out.println("O numero de algarismos pares desta sequencia e: " + pares);
        System.out.println("O numero de algarismos impares desta sequencia e: " + impares);
        System.out.println("A media dos valores pares desta sequencia e :  " + media);
    }
    
}
