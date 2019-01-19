import java.io.*;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    static String readline() {
        try {
            return bf.readLine();
        } catch (Exception e) {
            return null;
        }
    }
    static int[] soldiers, left, tempSoldiers, tempLeft, result;

    public static void main(String[] args) {

        int numOfTestCases = Integer.parseInt(readline());

        for (int i = 0; i < numOfTestCases; i++) {

            readData();

            mergeSort(0, soldiers.length);

            for (int j = 0; j < soldiers.length; j++) {
                result[soldiers[j]] = j + 1;
            }

            System.out.print(result[0]);

            for (int j = 1; j < result.length; j++) {
                System.out.print(" " + result[j]);
            }

            if (i != numOfTestCases - 1) {
                System.out.println();
            }

        }

    }

    static void readData() {
        int numOfSoldiers = Integer.parseInt(readline());
        soldiers = new int[numOfSoldiers];
        left = new int[numOfSoldiers];
        tempSoldiers = new int[numOfSoldiers];
        tempLeft = new int[numOfSoldiers];
        result = new int[numOfSoldiers];
        String[] moves = readline().split(" ");
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
