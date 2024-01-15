package SoCalHSPC2017;

import java.util.*;

public class Problem6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] a = new int[26];
		int odd = 0;
		String s = in.next();
		for(int i = 0; i < s.length(); i++) {
			a[s.charAt(i)-'a']++;
		}
		for(int j = 0; j < a.length; j++) {
			if(a[j] % 2 != 0) odd++;
		}
		if(odd>1) System.out.println("0");
		else System.out.println("1");

	}

}
