import java.util.Scanner;
public class Exercicio4
{
    private int checkSubCad (String cad, int n,String subcad) {
        int res=0;
        for (int x=0;x<subcad.length() && n<cad.length();x++,n++) {
            if (cad.charAt(n)==subcad.charAt(x)) res ++;
        }
        if (res==subcad.length()) return 1;
        else return 0;
    }
    public Exercicio4 () {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a Cadeia:");
        String cad = ler.next();
        System.out.println("Insira a sub-cadeia:");
        String subcad = ler.next();
        int res=0;
        for(int x=0;x<cad.length();x++){
            res += checkSubCad(cad,x,subcad);
        }
        System.out.println(res);
    }
}
