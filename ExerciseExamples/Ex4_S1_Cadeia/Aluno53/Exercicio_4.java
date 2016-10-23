import java.util.Scanner;
public class Exercicio_4
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String cadeia;
        String subcadeia;
        System.out.print("Cadeia: ");
        cadeia = scan.nextLine();
        System.out.print("Sub-cadeia: ");
        subcadeia = scan.nextLine();
        int tamanhocad = cadeia.length();
        int tamanhosub = subcadeia.length();
        int i = 0;
        int j = 0;
        int subs=0;
        if(!(cadeia.contains(subcadeia))) System.out.println("0");
        else{
            while(i<tamanhocad){
                if((cadeia.charAt(i))==(subcadeia.charAt(j))&& (j+1)==tamanhosub){subs++;i=i-(j-1);j=0;}
                else if((cadeia.charAt(i))==(subcadeia.charAt(j))){j++;i++;}
                else {i=i-(j-1);j=0;}
            }
        }
        
        System.out.println("Sub-cadeias: "+subs);
    }
}
