import java.util.Scanner;

class u004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String lite = input.nextLine();
        while (t>0) {
            String ss = input.nextLine();
            int ll = ss.length()-1;
            int total = 0;
            while (ll>=0) {
                char cc = ss.charAt(ll);
                if (cc=='A'||cc=='D'||cc=='O'||cc=='P'||cc=='Q'||cc=='R') {
                    total++;
                } else if (cc=='B') {
                    total=total+2;
                }
                ll--;
            }
            System.out.println(total);
            t--;
        }
    }
}
