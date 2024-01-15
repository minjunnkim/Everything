import java.util.*;
import java.io.*;
public class Fibonacci2 {
	public static void main (String[]args) throws IOException{
		long start = System.currentTimeMillis();
		
		BufferedReader in = new BufferedReader(new FileReader("Fibonacci.in"));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(in.readLine());
		long[] fib = new long[90]; 
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int j = 2; j < 90; j++) {
		
			fib[j] = fib[j-1]+fib[j-2];
		
		}
		
		for(int i = 0; i < n; i++) {
			
			int a = Integer.parseInt(in.readLine());
			
			out.write(fib[a]+"\n");
		
		}
		long end = System.currentTimeMillis();
		out.write(end-start+"\n");
		out.flush();
	}
}