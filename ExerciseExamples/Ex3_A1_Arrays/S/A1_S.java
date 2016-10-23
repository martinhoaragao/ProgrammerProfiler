import java.util.*;


public class A{


    public static void main (String [] Args){

        Scanner input = new Scanner (System.in);
        System.out.println(" ");
        int n=0,i,pares=0;
        n = input.nextInt();
        int[] array1= new int[n];
        for (i=0;i<n;i++){
            array1[i] = input.nextInt();
            if (array1[i]%2==0) pares++;
        }
        
        System.out.println(pares);

    }
    
}