package ACSL2004_2005;

import java.util.*;
import java.io.*;

public class C1Poker {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("0405C1.in"));
		
		for(int i = 0; i<9;i++) {
			
			int[] card = new int[5];
			
			
			//get data and organize
			for(int j = 0 ;j<5;j++) {
				card[j] = in.nextInt()%13;
			}
			
			//System.out.println(Arrays.toString(card));
		
			//check same card
			int count = 0;
			int key = 0;
			int pair = 0,triple= 0,four = 0;
			for(int k = 0;k<5;k++) {
				if(card[k] == -1) continue;
				key = card[k];
				count = 0;
				for(int l = 0;l < 5; l++) {
					if(key == card[l]) {
						count++;
						card[l] = -1;
					}
				}
			
				if (count == 2) pair++;
				else if (count == 3) triple++;
				else if (count == 4) four++;
				
				//System.out.println(Arrays.toString(card) + " " + pair + " " + triple + " " + four);
			}
			//output
			//1. Full House
			if(pair==1 && triple ==1) {
				System.out.println("FULL HOUSE");
			}
			//2. Pair
			else if(pair==1) {
				System.out.println("PAIR");
			}
			//3. Three of a Kind
			else if(triple == 1) {
				System.out.println("THREE OF A KIND");
			}
			//4. Four of a Kind
			else if(four==1) {
				System.out.println("FOUR OF A KIND");
			}
			//5. None
			else {
				System.out.println("NONE");
			}
		}
	}
}
