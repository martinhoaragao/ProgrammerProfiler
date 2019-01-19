import java.util.Scanner;

class HOLES {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while (t > 0) {

            int count = 0;

            String text = scanner.nextLine();

            text = text.toUpperCase();

            for (int i = 0; i < text.length(); i++) {

                Character c = text.charAt(i);

                if (c.equals('A') || c.equals('D') || c.equals('O') || c.equals('P') || c.equals('R') || c.equals('Q')) {
                    count++;
                } else if (c.equals('B')) {
                    count = count + 2;
                }
            }

            System.out.println(count);
            t--;
        }

    }
}
