package SoCalHSPC2017;

import java.util.*;

public class Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String equation = in.nextLine();
		int n = equation.charAt(0)-'0';
		for(int i = 1; i < equation.length() - 1;i++) {
			char c = equation.charAt(i);
			i++;
			int num = equation.charAt(i)-'0';
			
			if(c == '+') n += num;
			else if (c == '-') n -= num;
		}
		
		System.out.println(n);
			
		}
}
