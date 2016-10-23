import java.util.Scanner;

public class Exercicio1
{
    private int nrPar;
    private int nrImpar;
    private int media;
    
    public Exercicio1()
    {
        Scanner ler = new Scanner(System.in);
        this.nrPar = 0;
        this.nrImpar = 0;
        this.media = 0;
        System.out.println("Insira os numeros (0 para parar): ");
        int x = ler.nextInt();
        while (x!=0) {
            if (x%2==0) {
                this.nrPar++;
            }
            else {
                this.nrImpar++;
            }
            this.media += x;
            x = ler.nextInt();
        }
        if (this.media!=0) this.media /= (this.nrPar + this.nrImpar);
        System.out.println("Contêm " + this.nrPar + " numeros pares!");
        System.out.println("Contêm " + this.nrImpar + " numeros impares!");
        System.out.println("Contêm " + (this.nrPar+this.nrImpar) + " numeros!");
        System.out.println("Media: " + this.media);
    }
}
