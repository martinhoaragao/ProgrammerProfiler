import java.util.Scanner;

public class ex2
{
    
    public static void main(String[] args) {
        int M,N,idade,count;
        float media=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um número M : ");
        M=scanner.nextInt();
        System.out.println("Insira um número N : ");
        N=scanner.nextInt();
        count=N;
        
        while(N>0){
                System.out.println("Inserir uma idade : ");
                idade=scanner.nextInt();
                if(idade>M) System.out.println("A idade " + idade + " é maior do que " + M +"\n");
                media+=idade;
                N--;
        }
        media/=count;
        System.out.println("Média das idades: " + media);
}
}