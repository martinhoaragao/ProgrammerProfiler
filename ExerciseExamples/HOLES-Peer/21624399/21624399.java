import java.util.Scanner;
class J003 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int t = input.nextInt();
        String space =  input.nextLine();
        for(int i = 0;i<t;i++) {
            String s = input.nextLine();
            int counter = 0 ;
            for (int j = 0 ; j< s.length();j++) {
                char s1=s.charAt(j);
                if (s1=='A'||s1=='D'||s1=='O'||s1=='P'||s1=='Q'||s1=='R') {
                    counter++;
                } else if(s1=='B') {
                    counter+=2;
                }
            }
            System.out.println(counter);
        }
    }
}
