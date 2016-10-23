import java.io.*;
import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadeia, sub;
        int count = 0;
        System.out.println("Insira a cadeia e subcadeia");
        cadeia = sc.nextLine();
        sub = sc.nextLine();
        int lastIndex = 0;
        while(lastIndex != -1){
            lastIndex = cadeia.indexOf(sub,lastIndex);
            if(lastIndex != -1){
                count ++;
                lastIndex += 1;
            }
        }
        System.out.println(count);
    }
}
