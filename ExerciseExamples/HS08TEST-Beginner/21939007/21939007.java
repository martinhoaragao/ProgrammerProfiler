import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
 class Chef{

    public static void  main(String[] args) throws IOException{
        Reader.init(System.in);
        int X=Reader.nextInt();
        double Y=Reader.nextDouble();
        double total=0.0;
        if (X<=Y ){

            if (X%5==0){
                double sum=Y-X;
                total=sum-0.50;
                if (total>0){
                 System.out.println(String.format("%.2f", total));


                }
                else{
                    System.out.println(String.format("%.2f", Y));


                }
            }
            else{
                System.out.println(String.format("%.2f", Y));

            }

        }
    


        
        else {
            System.out.println(String.format("%.2f", Y));

        }

    }   
}