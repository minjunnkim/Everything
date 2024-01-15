package ACSL2015_2016;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;

public class C4RegExp {

	public static void main(String[] args)throws IOException {
		Scanner in = new Scanner(new File("1516C4.in"));
		for(int u = 0; u < 2; u++) {
		String [] RegExp= in.nextLine().split(", ");
		
		//System.out.println(Arrays.toString(RegExp));
		
		for(int i = 0; i < 5; i++) {
			String a = in.nextLine();
			Pattern p = Pattern.compile(a);
			//System.out.println(a);
			
			for(int k = 0; k < RegExp.length; k++) {
				Matcher m = p.matcher(RegExp[k]);
				//System.out.println(m.matches());
				if(m.matches()) System.out.print(RegExp[k] + " "); 
			}
			System.out.println();
			
		}
		}
	}	
}
