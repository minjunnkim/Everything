package ACSL2012_2013;

import java.util.*;
import java.io.*;

public class C3IntChessQueen {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1213IntC3.in"));

		for(int i = 0; i < 10; i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int N = in.nextInt();
			int count = 0;
			
			int [][] G = new int[9][9];
			
			for(int r = 1; r < 9; r++) {
				for(int c = 1; c < 9; c++) {
					if (y1-r == 0 && Math.abs(x1-c) <= N || y2-r == 0 && Math.abs(x2-c) <= N) {
						if(G[r][c] != 1) {
							G[r][c] = 1; count++;
						}
					}
					else if (x1-c == 0 && Math.abs(y1-r) <= N || x2-c == 0 && Math.abs(y2-r) <= N) {
						if(G[r][c] != 1) {
							G[r][c] = 1; count++;
						}
					}
					else if (Math.abs(x1-c) == Math.abs(y1-r) && Math.abs(y1-r) <= N || Math.abs(x2-c) == Math.abs(y2-r) && Math.abs(y2-r) <= N) {
						if(G[r][c] != 1) {
							G[r][c] = 1; count++;
						}
					}
				}
			}
			System.out.println(64-count);
		}
	}

}
