import java.util.Scanner;
public class ex1
{
    private static float pares;
    private static float impares;
    private static float media;
    private ex1 () {
        this.pares = 0;
        this.impares = 0;
        this.media = 0;
    }
    
    public static void initex1 () {
    float i;
    ex1 nova = new ex1();
        Scanner s = new Scanner(System.in);
    while((i = s.nextFloat())!=0){
        if(i%2==0) {
            nova.media=((media*nova.pares)+i)/(++(nova.pares));
        }else nova.impares++;
        System.out.println("Pares:"+nova.pares+" Impares:"+
                nova.impares+" Media:"+nova.media);
    }
    }
}
