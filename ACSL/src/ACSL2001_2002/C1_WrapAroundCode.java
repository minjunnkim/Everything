package ACSL2001_2002;
import java.util.Scanner;
public class C1_WrapAroundCode {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextLine().charAt(0)-'A'+1;
		if (c > 0 && c <= 5) {
			c = 2 * c;
		}
		else if (c > 5 && c <= 10) {
			c = (c % 3) * 5;
			
		}
		else if (c > 10 && c <= 15) {
			c = (c / 4)* 8;
		}
		else if (c > 15 && c <= 20) {
			c = (c % 10 + c / 10) * 10;
		}
		else if (c > 20 && c <= 26) {
			int max = 1;
			for (int i = 1; i < c; i++) {
				if (c % i == 0) {
					max = i;
				}
			}
			c = (max * 12);
		}
			if (c > 26) {
			c = c % 26;
			if (c == 0) {
				c = 26;
			}
		}
		char a = (char)(c + 'A' -1);
		System.out.println(a);
	}

}
	