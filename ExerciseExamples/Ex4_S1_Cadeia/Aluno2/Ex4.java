
public class Ex4
{
    public int ex4(char[] a , char[] b){
        int size_a = a.toString().length();
        int size_b = b.toString().length();
        int i;
        int j;
        int vezes=0;
        int errado=0;
        for(i=0;i<size_a;i++){
            if(a[i]==b[0]){
                for(j=0;j<size_b;j++){
                 if(a[i]!=b[j])errado=1;
                 i++;
                }
                if(errado==0)vezes++;
                else errado=0;
                i--;
            }
        }
        
        return vezes;
    }
}
