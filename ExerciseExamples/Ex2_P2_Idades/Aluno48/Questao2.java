
import java.util.*;
public class Questao2
{
    public static void main(int M, int N){
        Scanner in = new Scanner(System.in);
        double med = 0;
        int atual,i,total=0;
        for(i=N; i>0; i--){
            System.out.println("Insira uma idade, faltam: "+i+"\n");
            atual=in.nextInt();
            if(atual>M){
                System.out.println(atual+" é maior do que "+M+"\n");
                total+=atual;
            }
        }
        System.out.println("A média das idades superiores a "+M+
                           " inseridas é: "+total/N+"\n");
    }
}
