import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Pratik
 */
class Johny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int no=sc.nextInt();
            int[] songslen=new int[no];
            for (int i = 0; i < songslen.length; i++) 
                songslen[i]=sc.nextInt();   
            int pos=sc.nextInt();
            int song=songslen[pos-1];
            Arrays.sort(songslen);
            for (int i = 0; i < songslen.length; i++) {
                if(song==songslen[i])
                {
                    song=i+1;
                    break;
                }               
            }
            System.out.println(song);          
        }
    }    
}