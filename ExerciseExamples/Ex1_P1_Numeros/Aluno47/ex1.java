import java.util.Scanner;

public class ex1
{
    
    public static void main(String[] args) {
        int numero,pares=0,impares=0;
        float media=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um número : ");
        numero=scanner.nextInt();
        while(numero!=0){
                if((numero%2)==0) {pares++;media+=numero;}
                else impares++;
                System.out.println("Insira um número : ");
                numero=scanner.nextInt();
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        media/=pares;
        System.out.println("Média dos números pares: " + media);
}
}