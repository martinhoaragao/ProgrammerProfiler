
public class EX4 {
    public static void main(String cadeia, String subcadeia) {
        int quantas = 0;
        for(int i = 0; i <= cadeia.length()-subcadeia.length(); i++) {
            CharSequence aux = cadeia.subSequence(i, i+subcadeia.length());
            if(aux.equals(subcadeia)) {
                quantas++;
            }
        }
        System.out.println("A subcadeia aparece " + quantas + " vezes");
    }
}
