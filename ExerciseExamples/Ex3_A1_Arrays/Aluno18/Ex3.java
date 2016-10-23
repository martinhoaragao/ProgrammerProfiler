

public class Ex3
{
    public void ex3(int N, int array[]){
        int pares=0, i=0;
        while(i<N){
            if(array[i]%2==0) pares++;
            i++;
        }
        System.out.println("Existem no array " + pares + " numeros pares.");
    }
}
