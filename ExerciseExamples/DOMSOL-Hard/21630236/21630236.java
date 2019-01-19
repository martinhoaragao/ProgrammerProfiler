import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int[][] matrix;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int column = sc.nextInt();
    	matrix = new int[2][column];
    	for(int i = 0; i < 2; i++) {
    	    for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
    	    }
    	}
        int prev = 0;
        int score = vertical(0);
        for(int i = 1; i < column; i++) {
            int a = score + vertical(i);
            int b = prev + horizontal(i);
            prev = score;
            score = Math.max(a,b);
        }
        System.out.println(score);
	}

    public static int vertical(int i){
        return Math.abs(matrix[0][i] - matrix[1][i]);
    }

    public static int horizontal(int i){
        return Math.abs(matrix[0][i] - matrix[0][i-1]) + Math.abs(matrix[1][i] - matrix[1][i-1]);
    }
}
