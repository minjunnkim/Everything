package SoCalHSPC2017;

import java.util.*;

public class Problem2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		for(int i = 0; i < n;i++) {
			int num = in.nextInt();
			if(num > 0) result += num;
		}
		System.out.println(result);
	}
	
}
