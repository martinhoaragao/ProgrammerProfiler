import java.util.Scanner;
public class Exercicio_2
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int idades = n;
        int soma=0;
        int idade;
        double media;
        
        while(idades>0){
            System.out.print("Idade: ");
            idade = scan.nextInt();
            if(idade>m)System.out.println(idade);
            soma += idade;
            idades--;
        }
        media = (double)soma/n;
        System.out.println("A média das idades é "+media+"!");
    }
}
