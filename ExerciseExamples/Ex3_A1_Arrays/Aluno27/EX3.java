import java.util.*;

public class EX3
{
    public static void main(int n){
        int[] arr = new int[n];
        int i,n2=n,contaP=0;
        Scanner scan = new Scanner(System.in);
        i=n-1;
        while(i>=0){
            System.out.println("Escreva um número");
            arr[i]=scan.nextInt();
            i--;
        }
        
        for(i=0;i<n;i++){
            if(arr[i]%2 == 0)
                contaP++;
        }
        System.out.println("Há" + contaP + "elementos pares no array");
    }
}
