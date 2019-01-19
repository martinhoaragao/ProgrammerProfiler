import java.util.Scanner;

class JavaApplication1 {
    public static void main(String[] args) {
        
        int t, suma;
        Scanner wczytaj=new Scanner (System.in);
        t=wczytaj.nextInt();
        for (int j=0; j<t; j++)
        {
        String napis = wczytaj.next();
        char[] napisudany= napis.toCharArray();
        suma=0;
        for (int i=0; i<napisudany.length; i++)
        {
            if(napisudany[i]=='A'||napisudany[i]=='Q'||napisudany[i]=='R'||napisudany[i]=='O'||napisudany[i]=='P'||napisudany[i]=='D') suma++;
            else if(napisudany[i]=='B') suma=suma+2;
        }
        System.out.println(suma);
        }
        
    }
}