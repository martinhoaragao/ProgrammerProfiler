import java.util.Scanner;
import static java.lang.System.out;

public class Exercício1{
    
    public static void main(){
        double mediaPares;
        int val, somaPares;
        int npares, nimpares;
        Scanner input = new Scanner(System.in);
        
        npares = nimpares = somaPares = 0;
        out.println("Introduza uma sequência de números inteiros positivos e para terminar introduza o valor 0.");
        do{
            out.print(">>> ");
            val = input.nextInt();
            if(val > 0){
                if(val % 2 == 0){
                    somaPares += val;
                    ++npares;
                }
                else
                    ++nimpares;
            }
            else if(val < 0)
                out.println("Erro: Introduziu um número negativo! Tente novamente.");
            
            input.nextLine(); // consome newline que nextInt() deixou no buffer do stdin
        }
        while(val != 0);
        
        mediaPares = (npares > 0) ? (somaPares / (double) npares) : 0;
        out.print("Quantidade de números pares lidos: " + npares +
                  "\nQuantidade de números ímpares lidos: " + nimpares +
                  "\nMédia dos números pares: " + mediaPares);
    }          
}
