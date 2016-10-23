import java.util.Scanner;

public class Ex3
{
   public static void main(String[] args){
    int n=Integer.parseInt(args[0]),x=0,pares=0;
    int[] vetor = new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Digite um inteiro: ");
        Scanner ler = new Scanner(System.in);
        x=ler.nextInt();
        vetor[i]=x;
}
for(int i=0;i<n;i++){
    if(vetor[i]%2==0) pares++;
}
System.out.println("Pares: "+pares);
}
}
