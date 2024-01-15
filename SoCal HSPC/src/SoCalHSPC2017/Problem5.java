package SoCalHSPC2017;

import java.util.*;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int num = 0;
		for(int i = 1; i <= n/2;i++) {
			if (n%i == 0) {
				num += i;
			}
		}
		if(num == n) System.out.println("1");
		else System.out.println("0");
	}

}
