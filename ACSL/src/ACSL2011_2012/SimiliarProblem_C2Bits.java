package ACSL2011_2012;

import java.util.*;
import java.io.*;

public class SimiliarProblem_C2Bits {
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(new File("1112C2.in"));
			
			String result = "";
			
			for(int i=0; i<10;i++) {
			
				String input = in.nextLine().replace("*", "#");
			
				int f = input.indexOf("#");
				int l = input.lastIndexOf("#");	
				
				if(f==-1) {
					result = input;
				}
				else if(f == l) {
					result = input.replace("#", "0") + ", ";
					result += input.replace("#", "1");
				}
				else {
					result = input.replace("#", "1") + ", ";
					result += input.replace("#", "0") + ", ";
					result += input.replaceFirst("#", "0").replace("#", "1") + ", ";
					result += input.replaceFirst("#", "1").replace("#", "0");
				}
				System.out.println(result);
		}
	}
}