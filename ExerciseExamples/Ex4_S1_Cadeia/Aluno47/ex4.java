import java.util.Scanner;

public class ex4
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadeia,subcadeia;

        System.out.println("Insira a cadeia: ");
        cadeia=scanner.nextLine();
        System.out.println("Insira a subcadeia: ");
        subcadeia=scanner.nextLine();
        System.out.println(cadeia.split(subcadeia, -1).length-1);
    }  
   
}
