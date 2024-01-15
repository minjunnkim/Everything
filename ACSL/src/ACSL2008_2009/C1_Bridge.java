package ACSL2008_2009;

import java.util.*;
import java.io.*;

public class C1_Bridge {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("0809C1.in"));
		
		int r1 = 0;
		int r2 = 0;
		for(int i=0;i<10;i++) {
			int bid = in.nextInt();
			int tricks = in.nextInt();
			String Shape = in.next();
			int newBid = tricks - (6 + bid); 
			if(Shape.equals("C") || Shape.equals("D")) {
				r1 = bid*20;
				r2 = (newBid) * 20; 
				}
			else if(Shape.equals("H") || Shape.equals("S")) {
				r1 = bid*30;
				r2 = (newBid) * 30;
			}
			else if(Shape.equals("N")) {
				r1 = (bid-1) * 30 + 40;
				r2 = (newBid) * 30;
			}
			System.out.println(r1 + ", " + r2);
		}
	}

}
