import java.util.*;
class HOLES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noT = Integer.parseInt(sc.nextLine()), holes = 0;
        char[] ch = { 'A', 'D', 'O', 'P', 'Q', 'R' };
        String s = "";
        while(noT > 0) {
            s = sc.nextLine();
            holes = 0;
            label : for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                for(int j = 0; j < ch.length; j++) {
                    if(c == ch[j]) {
                        holes++;
                        continue label;
                    }
                }
                if(c == 'B') holes+=2;
            }
            System.out.println(holes);
            noT--;
        }
    }
}