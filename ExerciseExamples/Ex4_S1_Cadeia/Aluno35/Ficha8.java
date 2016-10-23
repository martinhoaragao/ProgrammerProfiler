package ficha8;

public class Ficha8 {
    
    
    public void cadeias(String token, String cadeia) {
        int length = cadeia.length();
        int tokenLength = token.length();
        int bound = length-tokenLength+1;
        char charToken = token.charAt(0);
        String subStr;
        int res = 0;
        
        for(int i = 0; i < bound; i++) {
            if(cadeia.charAt(i) == charToken){
                 subStr = cadeia.substring(i, i + tokenLength);
                 if(subStr.equals(token))
                     res++;
            }
        }
        
        System.out.println("Token repete " + res + " vezes!");
    }

}
