import java.util.*;
import java.io.*;
public class Fibonacci {
	public static void main (String[]args) throws IOException{
		long start = System.currentTimeMillis();
		
		Scanner in = new Scanner(new File("Fibonacci.in"));
		
		int n = in.nextInt();
		
		long[] fib = new long[90]; 
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int j = 2; j < 90; j++) {
		
			fib[j] = fib[j-1]+fib[j-2];
		
		}
		
		for(int i = 0; i < n; i++) {
			
			int a = in.nextInt();
			
			System.out.println(fib[a]);
		
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
