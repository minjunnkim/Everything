package SoCalHSPC2017;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		for(int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);	
			if(c == 'A' || c == 'B' || c == 'C') System.out.print(2);
			else if (c == 'D' || c == 'E' || c == 'F') System.out.print(3);
			else if (c == 'G' || c == 'H' || c == 'I') System.out.print(4);
			else if (c == 'J' || c == 'K' || c == 'L') System.out.print(5);
			else if (c == 'M' || c == 'N' || c == 'O') System.out.print(6);
			else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') System.out.print(7);
			else if (c == 'T' || c == 'U' || c == 'V') System.out.print(8);
			else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') System.out.print(9);
			else System.out.print(c);
		}

	}

}
