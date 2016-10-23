import java.util.Scanner;
import java.lang.String;

public class Exercicios
{
    public static void ex3(int N){
    
    Scanner scan = new Scanner(System.in);
    
    int x, pares=0;
    
    if(N<=0) {
        
        System.out.println("Número inválido");
        return;
    }
    
    int vetor[]= new int[N];
    
    for(int i=0; i<N; i++){
        
        System.out.println("Insira um número: ");
        x = scan.nextInt();
        
        if(x%2==0) pares++;
        
        vetor[i] = x;
    }
    
    System.out.println("Pares: "+pares);
    scan.close();
}

}



















