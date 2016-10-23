



public class Exercicio4
{
   public static void exer4(String s1,String s2){
       int conta = 0;
       int i;
       for(i=0;i<s1.length();i++){
           if(s1.substring(i).startsWith(s2)){
               conta++;
            }
        }
        
        System.out.println("A subcadeia"+ s2 +"aparece"+ conta +"vezes na cadeira"+ s1 +"\n");
    }
    
    
}
