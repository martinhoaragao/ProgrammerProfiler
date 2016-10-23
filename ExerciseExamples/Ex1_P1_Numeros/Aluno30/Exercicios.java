
import java.util.*;

public class Exercicios
{
    public static  void exercicio_1(){
        Scanner s = new Scanner(System.in);
        int i = 0;
        double i_atual=1, pares = 0, pares_n = 0, impares = 0;
        double media = 0.0;
        
        
        while(i_atual!=0){
            System.out.println("Qual o " + (i + 1) + "º inteiro? |0 - Sair|");
            i_atual = s.nextInt();
                while(i_atual<0){
                    System.out.println("Numero Incorreto! Coloque numeros inteiros ou 0 para sair");
                    System.out.println("Qual o " + (i + 1) + "º inteiro? |0 - Sair|");
                    i_atual = s.nextInt();
                }
            
            
            if( (i_atual)%2 == 0) { pares++; pares_n += i_atual;}
            else impares++;
            
            i++;
        
}
        media = ((double)(pares_n /(pares-1))) ;
        
        System.out.println("Numero de numeros pares: " + (pares - 1)); //por causa do 0
        System.out.println("Numero de numeros impares: " + impares);
        System.out.println("Média dos numeros pares: " + media);
    }
    


    

}