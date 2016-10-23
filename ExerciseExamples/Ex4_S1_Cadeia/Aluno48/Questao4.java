
public class Questao4
{
    public static void main(String cadeia, String subCadeia){
        int n,m=0,count=0;
        n=subCadeia.length();
        while(n<=cadeia.length()){
            if (cadeia.substring(m,n).equals(subCadeia)) {count++;}
            m++;
            n++;
        }
    }
}
