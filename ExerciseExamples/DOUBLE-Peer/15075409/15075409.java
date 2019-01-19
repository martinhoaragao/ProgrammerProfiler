import java.util.*;
class HOLES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noT = Integer.parseInt(sc.nextLine()), n = 0;
        while(noT > 0) {
            n = Integer.parseInt(sc.nextLine());
            if(n%2 == 0) System.out.println(n);
            else System.out.println(n-1);
            noT--;
        }
    }
}