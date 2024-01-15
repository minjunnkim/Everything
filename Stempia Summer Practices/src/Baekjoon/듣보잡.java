package Baekjoon;

import java.util.*;
import java.io.*;


public class µË∫∏¿‚ {
	    public static void main(String[]args){
	        Scanner in = new Scanner(System.in);
	        
	        int a = in.nextInt();
	        int b = in.nextInt();
	        
	        TreeMap<String, Integer> p = new TreeMap<String, Integer>();
	        int count = 0;
	        
	        for(int i = 0; i < (a+b); i++) {
	            String x = in.next();
	        	if(p.containsKey(x)) {
	            	p.put(x,2);
	            	count++;
	            }
	            else p.put(x, 1);
	            
	        }
	        System.out.println(count);
	        for(String n:p.keySet()) {
	        	if(p.get(n)==2) {
	        	System.out.println(n);
	        	}
	        	else continue;
	        }
	        
	    }
	}

