package Practices;

import java.util.*;
import java.io.*;

public class MapPractice {
	public static void main (String[]args)throws IOException {
		HashMap<String,Integer> w1 = new HashMap<String,Integer>();
		w1.put("Samuel", 105);
		w1.put("Jaden", 115);
		w1.put("Andrew", 120);
		System.out.println(w1);
		
		TreeMap<String,Integer> w2 = new TreeMap<String,Integer>();		//Ascending Alphabetical Order
		w2.put("Samuel", 105);
		w2.put("Jaden", 115);
		w2.put("Andrew", 120);
		System.out.println(w2);
		
		LinkedHashMap<String,Integer> w3 = new LinkedHashMap<String,Integer>();		//Same Order As The Input Order
		w3.put("Samuel", 105);
		w3.put("Jaden", 115);
		w3.put("Andrew", 120);
		System.out.println(w3);
	}
}
