package Coderbyte;
import java.io.*;
import java.util.*;

public class LongestWord {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		String sen = in.nextLine();
		String b = "";
	    String[] a = sen.split("\\s*[^a-zA-Z0-9]+\\s*");
	    for(int i = 0; i < a.length;i++){
	    	if(a[i].length()>b.length())
	    		b = a[i];
	    	
	    }
	    System.out.println(b);
	    
	    
		
	}
}