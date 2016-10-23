import java.util.Random;
/**
 * 3. Escreva um programa Java que, dado um número inteiro N
 * maior que 0, leia um vector (array unidimensionnal) de N elementos
 * inteiros e imprima quantos valores pares existem no vector.
 */
public class Ex3
{
   
    public static int geraArray(int n){
        int par = 0;
        int []arrayN = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            arrayN[i] = random.nextInt(101);
            if(arrayN[i]%2 == 0){
                par++;
            }
        }
        return par;
    }
}
