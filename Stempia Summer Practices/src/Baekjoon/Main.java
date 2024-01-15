package Baekjoon;

	import java.io.*;
	import java.util.*;
	public class Main {
		public static void main(String[] args) throws IOException{
			Scanner in = new Scanner(System.in);
			HashMap<String,Integer> m = new HashMap<String,Integer>();
			m.put("black", 0);
			m.put("brown", 1);
			m.put("red", 2);
			m.put("orange", 3);
			m.put("yellow", 4);
			m.put("green", 5);
			m.put("blue", 6);
			m.put("violet", 7);
			m.put("grey", 8);
			m.put("white", 9);
			String first = in.nextLine();
			String second = in.nextLine();
			String third = in.nextLine();
			long one = m.get(first)*10;
			long two = m.get(second);
			long three = m.get(third);
			long result = (long) ((one+two)*(Math.pow(10,three)));
			System.out.println(result);
			
		}
	}    
