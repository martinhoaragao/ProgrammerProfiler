import java.util.*;


public class ficha8{

    public static void ex2(int m,int n){
        int num;
        int total=0;
        int nr=0;
        String op;
        Scanner scan= new Scanner(System.in);

        while(n!=0){
            System.out.println("Escreva um numero:");
            op=scan.nextLine();

            try{
                num=Integer.parseInt(op);
                if(num>=m) System.out.printf("Idade recolhida:%d\n",num);
                else System.out.printf("Idade inferior ao necessario\n");

                total+=num;
                nr++;
            }
            catch(NumberFormatException e){}


            n--;
        }
        System.out.printf("Media lida: %d",total/nr);
    }



}