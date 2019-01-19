import java.io.*;


class MyIo
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
		
		Integer a=Integer.parseInt(reader.readLine());
		if(a!=42) System.out.println(a); else break ;
	}}
}