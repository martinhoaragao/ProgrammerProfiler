import java.util.Scanner;

/**
 *
 * @author Sam-Desk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, idPadre, sumid, sumPadres, sumHijos;
        t = in.nextInt();
        while (t > 0) {
            n = in.nextInt();
            sumPadres = 0;
            sumHijos = 0;
            while (n > 0) {
                idPadre = in.nextInt();
                sumid = in.nextInt();
                sumPadres += idPadre;
                sumHijos += sumid;
                n--;
            }
            System.out.println(sumPadres - sumHijos);
            t--;
        }
    }

}