package Coderbyte;

import java.util.*;
import java.io.*;

public class LetterChanges {
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String b = "";
	    char a;
	    for(int i = 0;i < str.length(); i++){
	        a = str.charAt(i);
	        if(a >= 'a' && a < 'z'){
	            a++;
	        }
	        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
	            a = Character.toUpperCase(a);
	        }
	        b = b + a;
	    }
	       
	    System.out.println(b);
	    	
		  } 
}
