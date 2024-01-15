/*
ID: ckandre1
LANG: JAVA
TASK: billboard 
 */

import java.util.*;
import java.io.*;

public class billboard {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("billboard.in"));
		PrintWriter out = new PrintWriter (new FileWriter("billboard.out"));
		
		int[][] wall = new int [2001][2001];
		int count = 0;
		
		for(int k = 0; k < 2; k++) {	
			int x1 = in.nextInt() + 1000;
			int y1 = in.nextInt() + 1000;
			int x2 = in.nextInt() + 1000;
			int y2 = in.nextInt() + 1000;
			
			for(int i = x1; i < x2; i++) {
				for(int j = y1; j < y2; j++) {
					wall[i][j] = 1;
					count++;
				}
			}
		}
		//System.out.println(count);
		
		int x1 = in.nextInt() + 1000;
		int y1 = in.nextInt() + 1000;
		int x2 = in.nextInt() + 1000;
		int y2 = in.nextInt() + 1000;
		
		for(int i = x1; i < x2; i++ ) {
			for(int j = y1; j < y2; j++) {
				if(wall[i][j] == 1) {
					count--;
				}
			}
		}
		out.println(count);
		
		out.close();
		in.close();
	}
}
