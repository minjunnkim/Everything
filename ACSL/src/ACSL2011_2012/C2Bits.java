package ACSL2011_2012;

import java.util.*;
import java.io.*;

public class C2Bits {
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(new File("1112C2.in"));
			
			String result = "";
			
			for(int i=0; i<10;i++) {
			
				String input = in.nextLine();
			
				int f = input.indexOf("*");
				int l = input.lastIndexOf("*");	
				
				if(f==-1) {
					result = input;
				}
				else if(f == l) {
					result = input.replace("*", "0") + ", ";
					result += input.replace("*", "1");
				}
				else {
					result = input.replace("*", "1") + ", ";
					result += input.replace("*", "0") + ", ";
					result += input.substring(0,f) + "0" + input.substring(f+1,l) + "1" + input.substring(l+1) + ", ";
					result += input.substring(0,f) + "1" + input.substring(f+1,l) + "0" + input.substring(l+1);
				}
				System.out.println(result);
			}	
		}
}