import java.util.Scanner;
public class Numeros
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num;
        int numimpar = 0;
        int med = 0;
        int i = 0;
        System.out.println("número novo? 0 para terminar\n");
        while((num = in.nextInt())!=0){
            if(num%2 == 1) numimpar++;
            else{
                med += num;
                i++;
            }
        }
        System.out.println("Numeros pares: " + i + "\nNumeros impares: " +
        numimpar + "\nMedia dos numeros pares: " + med/i);
    }
}
