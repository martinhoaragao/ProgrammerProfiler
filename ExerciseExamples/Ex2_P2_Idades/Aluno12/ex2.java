import java.util.Scanner ;
import java.util.Arrays ;

public class ex2{
    
    public static void main(int M, int N){
        Scanner in = new Scanner (System.in);
        int n=0,r,i=0, soma=0;
        int arr[]= new int[10];
        while (n<N){
            r=in.nextInt();
            if (r>M){arr[i]=r;i++;}
            soma+=r;
            n++;
        }
        System.out.println("Maiores que a idade dada:");
        System.out.println(Arrays.toString(arr));
        String s ="Idade: "+M+", Nº tentativas:"+N+ " ,Media: "+(soma/n);
        System.out.println(s);
    }
}
