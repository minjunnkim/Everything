package Practices;

import java.util.*;
import java.io.*;

public class ReverseMap {
	public static void main(String[]args) {
		HashMap<String,Integer> w1 = new HashMap<String,Integer>();
		w1.put("Samuel", 105);
		w1.put("Jaden", 115);
		w1.put("Andrew", 120);
		
		HashMap<Integer,String> w2 = new HashMap<Integer,String>();
		for(String n:w1.keySet()) {
			w2.put(w1.get(n), n);
		}
		System.out.println(w2);
	}
}
