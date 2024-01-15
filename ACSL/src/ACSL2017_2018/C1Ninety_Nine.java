package ACSL2017_2018;

import java.io.*;
import java.util.*;

public class C1Ninety_Nine {

	public static void main(String[] args) throws IOException {	
		Scanner in = new Scanner(new File("1718C1.in"));
		
		for(int i = 0; i < 10; i++) {
			int s = in.nextInt();
			ArrayList<Integer> Dealer= new ArrayList<Integer>();
			ArrayList<Integer> Player = new ArrayList<Integer>();
			
			for(int j = 0; j < 4;j++) {
				Player.add(in.nextInt());
			}
			for(int k = 0; k < 3;k++) {
				Dealer.add(in.nextInt());
				Player.add(in.nextInt());
			}
			//System.out.println(Dealer + " " + Player + " " + s);
			
			while(true) {
				s += rule(Player.remove(0), s);
				if(s > 99) {
					System.out.println(s +  ", " + "dealer");
					break;
				}
				s += rule(Dealer.remove(0), s);
				if(s > 99) {
					System.out.println(s + ", " + "player");
					break;
				}
			}
			
		}
	}
	public static int rule(int n, int s) {
		if(n == 9) {
			return 0;
		}
		else if(n == 4) {
			return -10;
		}
		else if(n == 0) {
			if(s + 11 > 99)return 1;
			else return 11;
		}
		else return n;
	}
}
