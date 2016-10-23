import java.util.*;

public class Exercicio3
{
    public static void main(int N) {
        int valor;
        int i=0;
        int conta=0;
        Scanner ler = new Scanner(System.in);
        
        int [] valores = new int[N];
        
        while(i<N) {
            valor = ler.nextInt();
            valores[i] = valor;
            i++;
        }
        
        while(i<N){
            if(valores[i] % 2 == 0){
                conta++;
                i++;
            }
        }
        System.out.println("Quantidade de números pares: " + conta);
    }
}
            
       
            
        