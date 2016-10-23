import java.util.Scanner;
public class ex2
{
    private float Midades;
    private float Nvalor;
    private float media;
    private float contador;
    private int sup;
    
    private ex2 () {
        this.Midades = 0;
        this.Nvalor = 0;
        this.media = 0;
        this.sup = 0;
        this.contador = 0;
    }
    public static void initex2 () {
        Scanner s = new Scanner(System.in);
        ex2 teste = new ex2 ();
        float i;
        System.out.println("Insira o limite M:");
        teste.Midades = s.nextFloat(); 
        System.out.println("INsira O Nº DE IDADES:");
        teste.Nvalor = s.nextFloat();
        
        while(teste.contador<teste.Nvalor){
            System.out.println("Insira o valor:");
            i = s.nextFloat();
            teste.contador++;
            if(i>teste.Midades){
                teste.media = ((teste.media *teste.sup)+i)/(++teste.sup);
            }
            
        }
        System.out.println("Midades:"+teste.Midades+" Nvalor:"+
                teste.Nvalor+" Media:"+teste.media+" contador:"+
                teste.contador+" Superiores:"+teste.sup);
    }
}
