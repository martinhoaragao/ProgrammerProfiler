
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

class Domino_Solitaire_DOMSOL 
{
	public static void main(String[] args) throws NumberFormatException, IOException
    {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(reader.readLine());
        
        int[][] board = new int[N][2];
        String[] input_line = reader.readLine().split(" ");
        for(int i=0; i<N; i++)
        {
        	board[i][0] = Integer.parseInt(input_line[i]);
        }
        input_line = reader.readLine().split(" ");
        for(int i=0; i<N; i++)
        {
        	board[i][1] = Integer.parseInt(input_line[i]);
        }
        int[] res = new int[N+1];
        
        res[0] = 0;
        res[1] = Math.abs(board[0][0] - board[0][1]);
        for(int i = 1; i<N; i++)
        {
        	int max = Math.abs(board[i][0] - board[i][1]) + res[i];
        	if(max < Math.abs(board[i][0] - board[i-1][0]) + Math.abs(board[i][1] - board[i-1][1]) +res[i-1])
        	{
        		max = Math.abs(board[i][0] - board[i-1][0]) + Math.abs(board[i][1] - board[i-1][1]) +res[i-1];
        	}
        	res[i+1] = max;
        }
        System.out.println(res[N]);
        
    }
}
        
      
