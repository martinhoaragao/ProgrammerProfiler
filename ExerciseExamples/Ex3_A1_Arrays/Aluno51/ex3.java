import java.util.Scanner;

public class ex3
{
    public static void ler (int N){
        int i,total=0;
        int array[]= new int[N];
        Scanner io = new Scanner(System.in);
        System.out.println("Insira " + N + " inteiros");
        for(i=0;i<N;i++){
            array[i]=io.nextInt();
            if(array[i]%2==0)total++;
        }
        
        System.out.println("Numero: " +total);
    }
}
