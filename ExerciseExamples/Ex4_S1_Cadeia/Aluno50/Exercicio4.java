
public class Exercicio4
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String maior, String menor)
    {
        int inicio=0;
        int fim = menor.length();
        int tam = maior.length();
        int total = 0;
        
        while(fim <= tam)
        {
            if(maior.subSequence(inicio,fim).equals(menor))total++;
            inicio++;
            fim++;
        }
        
        System.out.println("\nA cadeia " + menor + " aparece " + total + " na cadeia " + maior);
    }
}
