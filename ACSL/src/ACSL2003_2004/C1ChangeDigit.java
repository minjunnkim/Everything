package ACSL2003_2004;

import java.util.*;
import java.io.*;

public class C1ChangeDigit {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("0304C1.in"));
		
		for(int i = 0; i<10; i++) {
			String input = in.next();
			char[] digits = input.toCharArray();
			
			int sum = 0;
			for(int j = 0; j<digits.length;j++) {
				int temp = digits[j] - '0';
				sum += temp;
			}
			int mean = sum/digits.length;
			
			Arrays.sort(digits);
			int num = 0;
			for(int j = digits.length-1; j>=0;j--) {
				if (digits[j] - '0' <= mean) {
					num = digits[j] - '0';
					break;
				}
			}
			int index = input.indexOf(num+"");
			String result =  "";
			if(num <= 2) {
				result = input.substring(0, index) + digits[digits.length-1] + input.substring(index+1);
			}
			
			else if (num <= 5) {
				result = input.substring(0, index) + digits[0] + input.substring(index+1);
			}
			
			else if (num <= 8) {
				result = input.substring(0, index) + (sum%10) + input.substring(index+1);
			}
			else {
				result = input.substring(0, index) + 0 + input.substring(index+1);
			}
			
			if(result.charAt(0)=='0') result = result.substring(1);
			
			System.out.println(result);
			
		}
	}
	
}
