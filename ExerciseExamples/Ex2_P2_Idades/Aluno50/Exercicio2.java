import java.util.Scanner;

public class Exercicio2
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        System.out.println("Insira a idade minima: ");
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        System.out.println("Insira quantas idades quer introduzir: ");
        int quantos = s.nextInt();
        System.out.println("Insira as idades: ");
        int idade;
        double sum = 0;
        int i=0;
        
        while(i < quantos){
            idade = s.nextInt();
            if(idade<0) 
                System.out.println("Insira um numero positivo");
            else
            {
                if(idade>min) System.out.println("Idade " + idade + " é maior do que " + min);
                sum += idade;
            }
            i++;
        }
        
        System.out.println("Média de todas as idades: " + sum/quantos);
        
        
    }
}
