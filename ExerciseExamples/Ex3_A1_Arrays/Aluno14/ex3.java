import java.util.Scanner;

public class ex3{
    
    public static void main(String[] argv){
        arrayUnidimensional();
    }
    
    public static void arrayUnidimensional(){
        Scanner is = new Scanner(System.in);
        int numero;
        System.out.print("Dimensão do array: ");
        int size = Math.abs(is.nextInt());
        
        while(size == 0){
            size = Math.abs(is.nextInt());
        }
        
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Indice " + i + " do array: ");
            numero = is.nextInt();
            array[i] = numero;
        }
        
        System.out.print("Pares: ");
        for(int i: array){
            if(i%2 == 0) System.out.print(i + " ");
        }
            
    }

}