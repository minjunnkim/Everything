package ACSL2007_2008;

import java.util.*;
import java.io.*;

public class C1Triangles {
	public static void main(String[] args)  throws IOException{
		Scanner in = new Scanner(new File("0708C1.in"));
		
		for(int i = 0; i < 10; i++) {
			double [] a = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
			double [] b = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
			int count = 0;
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(a[j] == b[k]) {
						count++;
						b[k] = 0;
					}
				}
			}
			System.out.println(count);
		
		
		
		}
	}
}
