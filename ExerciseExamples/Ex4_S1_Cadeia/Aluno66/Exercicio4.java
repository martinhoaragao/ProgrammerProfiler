

import java.lang.String;

public class Exercicio4
{
    public static void main(String args[]){
        String cad = args[0], sub = args[1];
        int i, j, tamC = cad.length(), tamS = sub.length(), counter = 0;
        boolean b;
        for(i = 0; i < tamC; i++){
            b = true;
            for(j = 0; j < tamS && b; j++){
                if(j + i >= tamC) b = false;
                else{
                    b = cad.charAt(i+j) == sub.charAt(j);
                }
            }
            if(b) counter++;
        }
        System.out.println("'"+sub+"' ocorre "+counter+" vezes em '"+cad+"'");
    }
}
