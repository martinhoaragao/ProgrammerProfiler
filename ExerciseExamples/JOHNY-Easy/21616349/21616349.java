import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Start {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();
		for(int i=0;i<testCases;i++) {
			int songsNumber = reader.nextInt();
			ArrayList<Integer> lista = new ArrayList<>();
			for(int j=0;j<songsNumber;j++) 
				lista.add(reader.nextInt());
			int uncleJohnyIndex = reader.nextInt();
			int value = lista.get(uncleJohnyIndex-1);
			Collections.sort(lista);
			int positionofUncleJohny = lista.indexOf(value);
			System.out.println(positionofUncleJohny+1);
			}
		}
		
	}