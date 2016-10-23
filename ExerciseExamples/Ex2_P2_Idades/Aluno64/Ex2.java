import java.util.Scanner;

public class Ex2
{
    public static void main (String[] args){
    int n,m,nt=0;
    System.out.println("N idades:");
    Scanner ler = new Scanner(System.in);
    n = ler.nextInt();
    System.out.println("Dá-me um M");
    m= ler.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("Dá-me idade");
        int j = ler.nextInt();
        if(j>m) System.out.println("É de facto superior a "+m);
        nt+=j;
   }
   System.out.println("Média: "+(nt/n));
}
}