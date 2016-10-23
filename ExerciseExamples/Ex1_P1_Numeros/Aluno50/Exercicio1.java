import java.util.Scanner;

public class Exercicio1
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    public static void main(String[] args)
    {
        System.out.println("Insira um numero positivo");
        int numPares = 0;
        int numImp = 0;
        int sumPares = 0;
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        while(num!=0){
            if(num<0) 
                System.out.println("Insira um numero positivo");
            else
            {
                if(num%2 == 0)
                {
                    numPares++;
                    sumPares += num;
                }
                else
                    numImp++;
            }
            num = s.nextInt();
        }
        
        double media = (double)sumPares/numPares;
        System.out.println("\nNumeros ímpares: " + numImp);
        System.out.println("Numeros pares: " + numPares);
        System.out.println("Média dos números pares: " + media);
        
        
    }
}
