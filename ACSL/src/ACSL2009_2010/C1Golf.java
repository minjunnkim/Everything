package ACSL2009_2010;

import java.util.*;
import java.io.*;

public class C1Golf {
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(new File("0910C1.in"));
			
			int j = 0;
			int t = 0;
			
			for (int k = 0; k <= 3; k++) {
				int c = in.nextInt();
				int n = in.nextInt();
				j = j + n;
				t = t + c;
					if (n == c) {
						System.out.println("par");
					}
					else if (n == c - 1) {
						System.out.println("birdie");
					}
					else if (n == c - 2) {
						System.out.println("eagle");
					}
					else if (n == c + 1) {
						System.out.println("bogey");
					}
					else if (n == c + 2) {
						System.out.println("double bogey");
					}
				}
					if (j == t) {
						System.out.println("par");
					}
					else if (j == t - 1) {
						System.out.println("1 over par");
					}
					else if (j == t - 2) {
						System.out.println("2 over par");
					}
					else if (j == t + 1) {
						System.out.println("1 under par");
					}
					else if (j == t + 2) {
						System.out.println("2 under par");
					}
		}
}	
		
