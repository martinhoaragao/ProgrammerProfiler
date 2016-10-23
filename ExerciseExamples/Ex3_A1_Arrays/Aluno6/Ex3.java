

import java.util.Scanner; 
 
public class Ex3
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i=0, num;
        System.out.println("Indique o tamanho do vetor: ");
        n = sc.nextInt();
        int vector[] = new int[n];
        while( i!=n ){
            System.out.println("Indique um valor a inserir: ");
            num = sc.nextInt();
            vector[i]=num;
            i++;
        }
        i = 0;
        System.out.println("Números pares: ");
        while(i!=n){
            if(vector[i]%2==0) System.out.println(vector[i]+" ");
            i++;
        }
    }
}
