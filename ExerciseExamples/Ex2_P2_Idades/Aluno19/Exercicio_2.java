import java.util.Scanner;

public class Exercicio_2 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        
        int idades = n, soma = 0, idade;
        double media;
        
        while(idades > 0){
            System.out.print("Idade: ");
            idade = input.nextInt();
            if(idade > m) System.out.println("Idade: " + idade);
            soma += idade;
            idades--;
        }
        
        media = (double) soma / n;
        
        System.out.println("A média das idades é: "+media);
    }
    
}
