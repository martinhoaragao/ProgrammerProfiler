
public class Ex4
{
    public static void main(String subcadeia, String cadeia) {
        int qt = 0;
        int subComp = subcadeia.length();
        int cadComp = cadeia.length();
        for(int i = 0; i < cadComp && cadComp-i > subComp; i++) {
            int j = 0;
            if(cadeia.charAt(i) == subcadeia.charAt(0)) {
                for(int k = i; j < subComp && cadeia.charAt(k) == subcadeia.charAt(j); j++, k++);
                if(j == subcadeia.length())
                    qt++;
            }
        }
        System.out.println(qt);
    }
}
