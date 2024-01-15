/*
ID: ckandre1
LANG: JAVA
TASK: ride 
 */

import java.util.*;
import java.io.*;

public class ride {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("ride.in"));
		PrintWriter out = new PrintWriter (new FileWriter("ride.out"));
		
		String str = in.nextLine();
		String s = in.nextLine();
		int n1 = 1;
		int n2 = 1;
		
		for (int i = 0; i < str.length(); i++) {
		    int char1 = (str.charAt(i) - 'A') + 1;
		    n1 *= char1;
		}
		for (int j = 0; j < s.length(); j++) {
		        int char2 = (s.charAt(j) - 'A') + 1;
		        n2 *= char2;
		}       
		if (n1 % 47 == n2 % 47) {
		    out.println("GO");
		} else {
		    out.println("STAY");
		}
		
		out.close();
		in.close();
	}
}