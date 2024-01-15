package ACSL2016_2017;

import java.util.*;
import java.io.*;

public class C2Ascending {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("1617C2.in"));
		for(int i = 0;i < 10; i++) {
		
			char [] numbers = in.nextLine().toCharArray();
			
				String n = numbers[0]+"";
				
				int b = Integer.parseInt(n);
				
				System.out.print(b + " ");
			
			for(int j = 1; j < numbers.length; j++) {
				
				String str = numbers[j]+"";
				
				int a = Integer.parseInt(str);
				
				if(b < a) {
					System.out.print(a + " ");
					b = a;
				}
				
				else {
					
					while(j < numbers.length-1 && b >= a) {
						a *= 10; 
						a += Integer.parseInt(numbers[++j]+"");											
					}
					if(a >= b) {
						System.out.print(a + " ");
						b = a;
					}
				}
				
			}
			System.out.println();
		}
	}

}
