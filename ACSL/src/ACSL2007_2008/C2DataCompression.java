package ACSL2007_2008;

import java.io.*;
import java.util.*; 
public class C2DataCompression {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("0708C2.in")); 
		
		for(int i=0;i < 4; i++) {
			String input = in.nextLine();
			String result="";
			int count = 0;
			char key = input.charAt(0);
			for(int j=0;j < input.length();j++) {
				if (key == input.charAt(j)) count++;
				else {
					result+=count + "" + key;
					key = input.charAt(j);
					count = 0;
					j--;
				}
				
			}
			result+=count + "" + key;
			System.out.println(result);
		}
	}

}
