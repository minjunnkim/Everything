/*
ID: ckandre1
LANG: JAVA
TASK: gift1
 */

import java.util.*;
import java.io.*;

public class gift1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter (new FileWriter("gift1.out"));
		
		int NP = Integer.parseInt(in.readLine());
		
		LinkedHashMap<String,Integer> P = new LinkedHashMap<String,Integer>();
		for(int i = 0; i < NP; i++) {
			P.put(in.readLine(), 0);
			
		}
		StringTokenizer st;
		for(int i = 0; i < NP; i++) {
			String str = in.readLine();
			String n =in.readLine();
			st = new StringTokenizer(n);
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(y!=0) P.put(str, (-(x)+(x%y)+P.get(str)));
			for(int j = 0; j < y; j++) {
				String s = in.readLine();
				P.put(s, (x/y)+P.get(s));	
			}
			
		}
		for(String x:P.keySet()) {
			out.println(x + " " + P.get(x));
		}
		
		out.close();
		in.close();
		
	}
}