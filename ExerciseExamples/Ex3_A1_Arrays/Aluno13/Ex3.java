import java.util.Scanner;

public class Ex3
{
   public static void main()
   {
       Scanner s = new Scanner(System.in);
       Integer[] array;
       int N, i, valorlido;
       
       N = -1;
       
       while(N < 0)
       {
           System.out.println("Insira o número N:");
           N = s.nextInt();
       }
       
       array = new Integer[N];
       
       for(i = 0; i < N; i++)
       {
           System.out.println("Insira um valor:");
           valorlido = s.nextInt();
           array[i] = valorlido; 
       }
       
       System.out.println("Valores pares no vetor:");
       for(i = 0; i < N; i++)
       {
           if(array[i]%2 == 0)
                System.out.println(array[i]);
       }
   }
}
