import java.util.*;

public class EX1
{
    public static void main(){
        int numero,contaP=0,contaI=0,soma=0;
        float media;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um número positivo: ");
        numero = scan.nextInt();
        while(numero > 0){
            if(numero %2 == 0){
                soma+=numero;
                contaP++;
            }else{
                contaI++;
            }
            System.out.println("Escreva um número: ");
            numero = scan.nextInt();
        }
        media = (float)soma/(float)contaP;
        System.out.println("Quantidade de números pares: "+contaP+"\nMédia de números pares: "+media+
                           "\nQuantidade de números ímpares: "+contaI);
    } 
}
