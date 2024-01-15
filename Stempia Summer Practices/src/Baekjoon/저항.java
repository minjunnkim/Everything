package Baekjoon;

import java.util.*;
import java.io.*;

public class ÀúÇ× {
	public static void main(String[]args)throws IOException{
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> c = new HashMap<String, Integer>();
        c.put("black", 0);
        c.put("brown", 1);
        c.put("red", 2);
        c.put("orange", 3);
        c.put("yellow", 4);
        c.put("green", 5);
        c.put("blue", 6);
        c.put("violet", 7);
        c.put("grey", 8);
        c.put("white", 9);
        
        /*
        HashMap<String, Long> c2 = new HashMap<String, Long>();
        c2.put("black", 1l);
        c2.put("brown", 10l);
        c2.put("red", 100l);
        c2.put("orange", 1000l);
        c2.put("yellow", 10000l);
        c2.put("green", 100000l);
        c2.put("blue", 1000000l);
        c2.put("violet", 10000000l);
        c2.put("grey", 100000000l);
        c2.put("white", 1000000000l);
        */
        
        String a = in.nextLine();
        String b = in.nextLine();
        String d = in.nextLine();
        
        System.out.println((c.get(a)*10+c.get(b))*((long)Math.pow(10, c.get(d))));
    
    }
}
