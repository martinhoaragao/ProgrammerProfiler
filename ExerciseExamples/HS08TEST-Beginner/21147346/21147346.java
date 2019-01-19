import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner s = new Scanner(System.in);
        float amt = s.nextFloat();
        float bal = s.nextFloat();
        if(amt%5==0 && (amt+0.50)<=bal){
            System.out.println(String.format("%.2f",bal - (amt+0.50)));
        }
        else{
            System.out.println(String.format("%.2f",bal));
        }
    }
}
