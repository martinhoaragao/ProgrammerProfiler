import java.util.*;

public class Idades
{
   
   
   
   public void lerIdades(int n , int m){
    
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> idades = new ArrayList<>();
    ArrayList<Integer> maiores = new ArrayList<>();
    int auxiliar=0;
    double media=0;
    int somador=0;
    
    while(n>0){
    
    System.out.println("Introduza uma Idade!");    
    auxiliar = ler.nextInt();
    n--;
    
    if(auxiliar>m){
        
    maiores.add(auxiliar);
    idades.add(auxiliar);
    
    }
    
    else{
    
    idades.add(auxiliar);
    
    }
   
    }
   
    for(Integer i: idades){
    somador= somador + i;
    }
    
    media=(somador/idades.size());
    System.out.println("Media de idades: \n" +media);
    System.out.println("Idades Maiores: \n");
    for(Integer i : maiores){
        
    System.out.println("Idade: "+i+"\n");
    
    }
    }
   
}
