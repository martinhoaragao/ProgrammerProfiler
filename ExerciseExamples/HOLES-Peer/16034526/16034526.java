/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(in);
		String rawInput= br.readLine();
		Integer totalTestCases = Integer.parseInt(rawInput);
		Map<Character,Integer> alphaHolesMap = getCharacterHolesMap();
		for(int i = 0;i < totalTestCases; i++){
		    char []input = br.readLine().toCharArray();
		   // System.out.println(input.length);
		    int holesCount = 0;
		    for(int j = 0; j < input.length; j++){
		        if(alphaHolesMap.get(input[j]) != null)
		           holesCount += alphaHolesMap.get(input[j]);
		    }
		    System.out.println(holesCount);
		}
	}
	
	public static Map<Character,Integer> getCharacterHolesMap(){
	    Map<Character,Integer> alphaHolesMap = new HashMap();
	    alphaHolesMap.put('A',1);
	    alphaHolesMap.put('B',2);
	    alphaHolesMap.put('D',1);
	    alphaHolesMap.put('O',1);
	    alphaHolesMap.put('P',1);
	    alphaHolesMap.put('Q',1);
	    alphaHolesMap.put('R',1);
	    return alphaHolesMap;
	}
}
