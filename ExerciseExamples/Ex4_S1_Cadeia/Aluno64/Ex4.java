import java.util.Scanner;

public class Ex4
{
   public static void main(String[] args){
    int x=0;
    Scanner ler = new Scanner(System.in);
    System.out.println("Subcadeia: ");
    String sub = ler.nextLine();
    System.out.println("Cadeia: ");
    String cadeia = ler.nextLine();
    for(int i=0;i<cadeia.length();i++){
        int tmp=i;
            for(int j=0;j<sub.length() && tmp<cadeia.length() && cadeia.charAt(tmp)==sub.charAt(j);j++,tmp++){
                if(j+1==sub.length()) x++;
            }
        }
System.out.println("Vezes: "+x);
}
}
