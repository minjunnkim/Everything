package ACSL20042005;

import java.util.*;
import java.io.*;

public class C2DigitalDeletions {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("0405C2.in"));
		
		for(int i = 0; i < 8; i++) {
			//get data and organize
			String input = in.nextLine().replace(" ",  "").replace(",", "");
			
			//processing and output
			int count = 0;
			while(input.length()> 0) {	
				//find zero
				int zero = input.lastIndexOf("0");
				
				
				//remove characters before zero
				if(zero>=0) {
					input = input.substring(zero+1);
					count++;
				}
				
				//check if input is empty
				if(input.length() == 0) break;
				
				//find maximum number and index	
				int max = Integer.parseInt(input.substring(0,1));
				
				for(int j = 0; j < input.length(); j++) {
					max = Math.max(max, Integer.parseInt(input.substring(j ,j + 1)));
				}
				int last = input.lastIndexOf(max+"");
				
				//if odd --> replace(max, max-1) else replace(max, max-2)
				if(max % 2 == 1) max -= 1;
				else max -= 2;
				
				input = input.substring(0, last) + max + input.substring(last + 1);
				count++;
			}
	
			System.out.println(count);
		}
	}	
}
