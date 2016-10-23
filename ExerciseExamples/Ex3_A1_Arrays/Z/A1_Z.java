import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt(), evens = 0;
        int[] numbers = new int[size];
    
        for(int i=0; i<size; i++)numbers[i] = in.nextInt();
        
        for(int number : numbers){
            if ( (number & 1) == 0 )evens++;
        }
    
        System.out.println(evens);
    }
}