
import java.io.*;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static String readline(int maxLength) {
        byte line[] = new byte [maxLength];
        int length = 0;
        int input = -1;
        try{
            while (length < maxLength){
                input = System.in.read();
                if ((input < 0) || (input == '\n')) break;
                line [length++] += input;
            }

            if ((input < 0) && (length == 0)) return null;
            return new String(line, 0, length);
        }catch (IOException e){
            return null;
        }
    }
    static int[] soldiers, left, tempSoldiers, tempLeft, result;

    public static void main(String[] args) {

        int numOfTestCases = Integer.parseInt(readline(10));

        for (int i = 0; i < numOfTestCases; i++) {

            readData();

            mergeSort(0, soldiers.length);

            for (int j = 0; j < soldiers.length; j++) {
                result[soldiers[j]] = j + 1;
            }
            StringBuffer k = new StringBuffer(result.length*7);
            k.append(String.valueOf(result[0]));
            for (int j = 1; j < result.length; j++) {
                k.append(' ');
                k.append(result[j]);
            }
            System.out.println(k);
        }
    }

    static void readData() {
        int numOfSoldiers = Integer.parseInt(readline(10));
        soldiers = new int[numOfSoldiers];
        left = new int[numOfSoldiers];
        tempSoldiers = new int[numOfSoldiers];
        tempLeft = new int[numOfSoldiers];
        result = new int[numOfSoldiers];
        String[] moves = readline(numOfSoldiers*7).split(" ");
        for (int i = 0; i < numOfSoldiers; i++) {
            soldiers[i] = i;
            left[i] = Integer.parseInt(moves[i]);
        }
    }

    private static void mergeSort(int start, int end) {
        if (end > start && (end - start) != 1) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid, end);
            merge(start, mid, end);
        }
    }

    private static void merge(int start, int mid, int end) {
        int a = start, b = mid, c = start;
        while (c < end) {
            if(a>=mid){
                tempSoldiers[c]=soldiers[b];
                tempLeft[c++]=left[b++];
            }else if(b>=end){
                tempSoldiers[c]=soldiers[a];
                tempLeft[c++]=left[a++];
            }else if(c-left[a]>=b-left[b]){
                tempSoldiers[c]=soldiers[b];
                tempLeft[c]=left[b]-(b-c);
                b++;
                c++;
            }else{
                tempSoldiers[c]=soldiers[a];
                tempLeft[c++]=left[a++];
            }
        }
        for(int i = start; i<end; i++){
            left[i]=tempLeft[i];
            soldiers[i]=tempSoldiers[i];
        }
    }
}
