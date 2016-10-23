public class Cadeias
{
    public static void main(String subcadeia, String cadeia){
        int count = 0;
        int indice = cadeia.indexOf(subcadeia);
        while(indice != -1){
            count++;
            cadeia = cadeia.substring(indice+1);
            indice = cadeia.indexOf(subcadeia);
        }
        System.out.println("Número de subcadeias " + count);
    }
}
