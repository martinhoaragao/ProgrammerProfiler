import java.util.Scanner;

public class ex1{

    public static void main(){
        Scanner in = new Scanner (System.in);
        int r;
        int pares=0, impares=0, soma=0;
        while ((r=in.nextInt())!=0){
            if (r%2==0){ pares++; soma+=r;}
            else impares++;
        }
        String s ="Pares"+pares+", Impares:"+impares+ " Media:"+(soma/pares);
        System.out.println(s);
    }
}
