package SoCalHSPC2017;

import java.util.*;

public class Problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = "";
		for(int i = 0; i < n;i++) {
			s += in.next();
		}
		s = Integer.parseInt(s) + 1 + "";
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
