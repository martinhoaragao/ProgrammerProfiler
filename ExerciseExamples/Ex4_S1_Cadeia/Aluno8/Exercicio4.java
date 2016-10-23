import java.util.Scanner;

public class Exercicio4
{
    public Exercicio4()
    {
        Scanner ler = new Scanner(System.in);
        int i,tm=0;
        System.out.print("Ler String principal: ");
        String c = ler.next();
        System.out.print("\nLer sub-string: ");
        String sc = ler.next();
        for(i=0;i<c.length();i++) {
            if(checksub(c,i,sc)==1) tm++;
        }
        System.out.print("\nContêm "+tm+" sub-strings!\n");
    }
    
    int checksub(String c, int i, String sc) {
        int j,aux=0;
        for(j=0;j<sc.length() && i<c.length();j++) {
            if(c.charAt(i)==sc.charAt(j)) {
                i++;
                aux++;
            }
        }
        if (aux==sc.length()) return 1;
        else return 0;
    }
}
