package Practices;

import java.util.*;
import java.io.*;

public class MapPractice2 {
	public static void main(String[] args) {
		HashMap<String,Integer> w = new HashMap<String,Integer>();
		w.put("Samuel", 105);
		w.put("Jaden", 115);
		w.put("Andrew", 120);
		
		HashMap<Integer,String> w1 = new HashMap<Integer,String>();
		w1.put(105, "Samuel");
		w1.put(115, "Jaden");
		w1.put(120, "Andrew");
		System.out.println(w.get("Jaden"));
		for(String n:w.keySet()) {
			System.out.println(n + " is " + w.get(n) + " lbs.");
		}
		int x = Math.max(w.get("Samuel"), w.get("Jaden"));
		int y = Math.max(x,  w.get("Andrew"));
		System.out.println(w1.get(y) + " is " + y + " lbs.");
		
		/*
		 import java.io.*;
import java.util.*;

public class HashMapPractice2 {

	public static void main(String[] args) throws IOException{
		HashMap<String, Integer> m = new HashMap<String, Integer>(); //random order print, but fastest
		m.put("Samuel", 105);
		m.put("Jaden", 115);
		m.put("Andrew", 120);
		
		for(String n :m.keySet()){
			System.out.println(n+ " is " + m.get(n)+ " lbs.");
		}
		
		int max = 0;
		String maxName = "";
		for(String n:m.keySet()){
			if(m.get(n) > max){
				max=m.get(n);
				maxName = n;
			} 
		}
		System.out.println(maxName + " " + max);
	}

}
		 */
	}
}
