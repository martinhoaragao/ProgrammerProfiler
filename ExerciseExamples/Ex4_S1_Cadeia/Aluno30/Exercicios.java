
import java.util.*;

public class Exercicios
{
    
        public static void exercicio_4(){
        Scanner s = new Scanner(System.in);
        String sub_cad = " ";
        String cad = " ";
        System.out.println("Qual a sub cadeia que pretende?");
        sub_cad = s.nextLine();
        System.out.println("Qual a cadeia que pretende?");
        cad = s.nextLine();
        int tamanho = sub_cad.length();
        int tamanho2 = cad.length();
        int resultado = 0;
        int contagem = 0;
        int k = 0;
        for(int i = 0; i < tamanho2 ; i++){
            if ( tamanho <= tamanho2 - i) {
                for(int j = i; j < tamanho + i ; j++){
                    
                    if(sub_cad.charAt(k)==(cad.charAt(j))) contagem ++ ;
                    k++;
}
                if ( contagem == tamanho ) resultado++;
                    contagem = 0; k = 0;
        }
}

         System.out.println("A sub cadeia " +sub_cad+ " aparece " + resultado + " na cadeia " + cad);
         
}

}