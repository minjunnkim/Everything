package ACSL2012_2013;

import java.util.*;
import java.io.*;

public class C2Cells {
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(new File("1213C2.in"));
			
			for(int i=0; i<10; i++) {
				String com = in.next();
				String S = in.next();
				String result = "";
				
				if (com.equals("DIVIDE") ) {
					String result1 = S.substring(0,4) + S.substring(0,4);
					String result2 = S.substring(4) + S.substring(4);
					System.out.println(result1 + " and " + result2);
				}
				else if (com.startsWith("ADD")) {
					int n = Integer.parseInt(com.substring(com.length()-1));
					
					String result1 = S.substring(0,n);
					String result2 = S.substring(0,S.length()-n);
					System.out.println(result1 + result2);
					
				}
				else if(com.startsWith("SUBTRACT")) {
					int n = Integer.parseInt(com.substring(com.length()-1));
					if (n == 0) {
						System.out.println(S);
					}
					else {
					String result1 = S.substring(n);
					String result2 = S.substring(S.length()-n);
					System.out.println(result1 + result2);
					}
				}	
			}
		}

}
