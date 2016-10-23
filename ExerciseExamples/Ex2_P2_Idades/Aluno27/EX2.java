import java.util.*;

public class EX2
{
    public static void main(int n,int m){
        int contaI = 0,soma=0,idade,n2=n;
        float media;
        Scanner scan = new Scanner(System.in);
        
        while(n>0){
            System.out.println("Escreva uma idade");
            idade = scan.nextInt();
            if(idade > m){
                System.out.println(idade+ " é maior que "+ m);
            }
            soma += idade;
            n--;
        }
        media = (float)soma/(float)n2;
        System.out.println("Média das idades lidas: "+media);
    }
}
