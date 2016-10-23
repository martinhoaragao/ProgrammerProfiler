import java.util.Scanner;

public class ex3
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,i,pares=0;
        
        System.out.println("Insira um número N: ");
        N=scanner.nextInt();
        if(N<=0) {System.out.println("O número tem que ser maior do que 0");return;}
        
        int[] num = new int[N];
        for(i=0;i<N;i++){
             System.out.println("Posição " + i + " do array.");
             num[i]=scanner.nextInt();
             if((num[i]%2)==0) pares++;
        }
        System.out.println("Total de números pares: " + pares);
}
}