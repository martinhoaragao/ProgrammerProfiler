    import static java.lang.System.out;
    import java.util.Scanner;


public class exc1{
private int nrPares;
    private int totalPares;
    private int nrImpares;
    private int lido;
    
    public exc1(){
        nrPares = 0;
        totalPares = 0;
        nrImpares = 0;
        lido = 0;
    }
    
    public void correrExercicio(){
       Scanner input = new Scanner(System.in);
        
       do{
            out.print("Introduza um valor inteiro: ");
            
            lido = input.nextInt();
            
            if(lido > 0){
                
                if(lido % 2 == 0){
                    nrPares++;
                    totalPares += lido;
                } else {
                    nrImpares++;
                }
            }
            out.println("O número de pares é: " + nrPares);
            out.println("A média dos numeros pares é: " + totalPares/nrPares);
            out.println("O número de impares é: " + nrImpares);
            
       }while(lido != 0);
        
       input.close();
    }
}


