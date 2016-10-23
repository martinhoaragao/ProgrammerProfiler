import java.util.*;


public class ficha8{

    public static void ex3(int n){
        int []array=new int[n];
        int i=0;
        int par=0;
        String op;
        int num;
        Scanner scan = new Scanner(System.in);

        while(i!=n){
            System.out.println("Escreva um numero:");
            op=scan.nextLine();

            try{
                num=Integer.parseInt(op);
                if(num%2==0) par++;
                
                array[i]=num;
            }
            catch(NumberFormatException e){}
        }
        System.out.printf("Numeros pares:%d",par);
    }



}