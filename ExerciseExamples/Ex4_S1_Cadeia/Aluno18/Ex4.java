
public class Ex4
{
    public void ex4(char[] word, char[] sub){
        int i, j=0, count = 0, iterador;
        for(i=0;i!=word.length;i++){
            if(word[i]==sub[j]){
                iterador=i;
                for(;iterador<word.length && j<sub.length && word[iterador]==sub[j]; iterador++, j++){}
            }
            if(j==sub.length) count++;
        }
        System.out.println("Existem " + count + " repetições de " + sub + " em " + word + ".");
    }
}
