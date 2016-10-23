
public class Ex3
{
    public static int[] criaVector(int n){
        
        int [] array = new int[n];
        return array;
    }
    
    public static int filtraPares(int[] array){
    
        int count = 0;
        for(int i = 0; i< array.length;i++) if((array[i] % 2) == 0) count++;
        return count;
    }
}
