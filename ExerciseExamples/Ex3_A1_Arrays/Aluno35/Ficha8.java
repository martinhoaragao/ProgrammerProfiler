package ficha8;

import java.util.Scanner;

public class Ficha8 {
    
    
    public void numeroPares(int n) {
        if(n<=0)
            System.out.println("Introduza um valor maior que 0!");
        int[] array = new int[n+1];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        
        int res = 0;
        
        for(int i = 0; i < n; i++){
            if(array[i] % 2 == 0)
                res++;
        }
        
        System.out.println(res);
        scan.close();
    }
    
}
