


public class Ex4
{
    public static int contaSubCadeias(String string,String subcadeia){
        
        int count = 0;
        int pos = 0;
        
        while (pos < string.length() ){
            
            if (string.substring(pos).contains(subcadeia) == true) 
                if( string.substring(pos).indexOf(subcadeia) == 0 ) count++;
            pos++;
        }
        return count;
    }
}
