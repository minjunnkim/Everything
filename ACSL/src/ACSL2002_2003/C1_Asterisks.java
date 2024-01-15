package ACSL2002_2003;

import java.util.*;
import java.io.*;

public class C1_Asterisks {

	public static void main(String[] args) throws IOException {
		
			Scanner in = new Scanner(new File("0203C1.in"));

			for(int k=0; k<9; k++) {
				//get data
				String c = in.next();
				int n1= in.nextInt();
				int n2 = c.equals("B")? in.nextInt(): 0;
				
				//processing and output
				if (c.equals("S")) { 
					for (int i = 0; i < n1; i++) {
						for (int j = 0; j < n1; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
				else if (c.equals("H")) { 
					for (int i = 0; i < n1; i++) {
						for(int j=0; j < i; j++) {
							System.out.print(" ");
						}
							for (int j = 0; j < n1-i; j++) {
								System.out.print("*");
							}
							System.out.println();
					}
				}
				else if (c.equals("L")) { 
					for (int i = 0; i < n1; i++) {
						for (int j = 0; j <= i; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
				else if (c.equals("B")) { 
					for (int i = 0; i < n2; i++) {
						for (int j = 0; j < n1; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
				System.out.println();
				
			}
	}
}
