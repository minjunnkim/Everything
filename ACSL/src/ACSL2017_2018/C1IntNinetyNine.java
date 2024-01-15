package ACSL2017_2018;

import java.util.*;
import java.io.*;

public class C1IntNinetyNine {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1718IntC1.in"));
		
		for(int i = 0;i < 10; i++) {
			//Get data and organize
			int score = in.nextInt();
			ArrayList<Integer> Player = new ArrayList<Integer>();
			//System.out.println(score);
			for(int j = 0; j < 3;j++) {
				Player.add(Integer.parseInt(in.next().replace("T", "10").replace("J", "11").replace("Q", "12").replace("K", "13").replace("A", "14")));	
			}
			//System.out.println(Player);
			while(true) {
				Collections.sort(Player);
				score += rule(Player.remove(Player.size()-1), score);
				if(score > 99) {
					System.out.println(score + ", Dealer");
					break;
				}
				Player.add(Integer.parseInt(in.next().replace("T", "10").replace("J", "11").replace("Q", "12").replace("K", "13").replace("A", "14")));
				score += rule(Integer.parseInt(in.next().replace("T", "10").replace("J", "11").replace("Q", "12").replace("K", "13").replace("A", "14")), score);
				if(score > 99) {
					System.out.println(score + ", Player");
					break;
				}
			}
			in.nextLine();
		}
	}
	public static int rule(int n, int s) {
		if(n == 9) {
			return 0;
		}
		else if(n == 10) {
			return -10;
		}
		else if(n == 14) {
			if(s + n > 99) {
				return 1;
			}
			else return 14;
		}
		return n;
	}
}
