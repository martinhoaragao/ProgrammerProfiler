import java.util.*;


public class ficha8{

    public static void ex1(){
        Scanner scan= new Scanner(System.in);
        int par=0;
        int total=0;
        int num=-1;
        String op;

        while(num!=0){
            System.out.println("Escreva o proximo numero:");
            op=scan.nextLine();

            try{
                num=Integer.parseInt(op);
                if(num%2==0 && num!=0){ par++;total+=num;}
            }
            catch(NumberFormatException e){}
        }
        System.out.printf("Numero de pares: %d\nMedia: %d\n",par,total/par);
    }


}