import java.util.*;
import java.io.*;
public class TestCase {
	public static void main (String[]args)throws IOException {
		PrintWriter out = new PrintWriter(new File("Fibonacci.in"));
		
		int n = 1000000;
		out.println(n);
		
		Random r = new Random();
		
		for(int i = 0; i < n; i++) {
			out.println(r.nextInt(90));
		}
		out.close();
	}
	
}
