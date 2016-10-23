

import java.util.*;
import java.io.*;

public class Ex3
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int n;
    private Vector<Integer> vect;
    
    public void main () {
        int vect[],i=1,v,n,pares=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho N:");
        n=scanner.nextInt();        
        vect= new int[n];
        while(i<=n){
            System.out.println("Valor "+i);
            v=scanner.nextInt();
            vect[(i-1)]=v;
            i++;
        }
        for(i=0;i<n;i++) {
            if (vect[i]%2==0) pares++;
        }
        System.out.println("Pares no array: "+pares);
    }
    
}
