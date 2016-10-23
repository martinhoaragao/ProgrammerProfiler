import java.util.*;


public class ficha8{

    public static void ex4(){
        int n=0;
        String total;
        String parte;
        Scanner scan = new Scanner(System.in);
        int comprimento,inicio, fim,i;

            System.out.println("Insera a string total");
            total=scan.nextLine();
            System.out.println("Insera a sub-string");
            parte=scan.nextLine();
            i=0;
            inicio=0;
            fim=parte.length();
            comprimento=total.length()+1;

        do{

            if(parte.equals(total.substring(inicio,fim))) n++;

            inicio++;
            fim++;
        }while(fim!=comprimento);

        System.out.printf("Aparece %d vezes\n",n);


    }



}