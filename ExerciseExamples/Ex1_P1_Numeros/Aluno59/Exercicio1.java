import java.util.Scanner;
public class Exercicio1
{
    public Exercicio1 () {
        Scanner ler = new Scanner (System.in);
        int nT=-1, nP=0, nI=0, x=0;
        double med=0;
        System.out.println("Insira os numeros:");
        do{
            nT+=1;
            if (isPar(x)==1) nP+=1;
            else if (isPar(x)==2) nI+=1;
            if (nT!=0) med = ((nT*med)+x)/(nT+1);
            x=ler.nextInt();
        }while(x!=0);
        System.out.println("Numeros pares: "+nP+"\nNumeros impares: "+nI+"\nTotal: "+nT+"\nMedia: "+med);
    }
    private int isPar (int x) {
        if (x==0) return 0;
        else if (x%2==0) return 1;
        else return 2;
    }
}
