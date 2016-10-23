public class Exercicio4 {

    public static void main(String[] args){
		int tamanhocad, tamanhosub, i, j, subs; 
		String subcadeia, cadeia;

		if (args.length != 2) {
			System.out.println("Número de argumentos inválidos!");
			return;
		}

		subcadeia = args[0];
        cadeia = args[1];
      
        tamanhosub = subcadeia.length();
        tamanhocad = cadeia.length();
        i = j = subs = 0;

        while(i < tamanhocad){
        	if ((cadeia.charAt(i)) == (subcadeia.charAt(j)) && (j+1) == tamanhosub) {
				subs++;
				i = i - (j-1);
                j = 0;
        	} else if ((cadeia.charAt(i))==(subcadeia.charAt(j))){
				j++;
				i++;
			} else {
				i = i - (j-1);
        	    j = 0;
			}
        }
        
        System.out.println("Sub-cadeias: " + subs);
    }
}
