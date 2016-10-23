

import java.util.*;
public class Questao3
{
    public static void main(int N, int arr[]){
        int i,pares=0;
        for(i=0;i<N;i++){
            if(arr[i]%2==0){pares++;}
        }
        System.out.println("Existem neste array "+pares+" números pares.\n");
    } 
}
