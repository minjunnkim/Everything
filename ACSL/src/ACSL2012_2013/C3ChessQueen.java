package ACSL2012_2013;

import java.util.*;
import java.io.*;

public class C3ChessQueen {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1213C3.in"));
		
		for(int i = 0; i < 10; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int N = in.nextInt();
			int count = 0;
			
			int[][] B = new int[6][6]; 
			
			for(int r = 1; r < 6; r++) {
				for(int c = 1;c<6;c++) {
					if(y-c == 0 && Math.abs(x-r) <= N) {
						count++;
					}
					else if(x-r == 0 && Math.abs(y-c) <= N) {
						count++;
					}
					else if(Math.abs(x-r)==Math.abs(y-c) && Math.abs(y-c) <= N) {
						count++;
					}
				}
			}
			System.out.println(25-count);
			
		}
		
	}

}
