public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 5;
		int c = 0;
		/*	c = a + b;
			a = b;
			b = c;
		}*/
		System.out.println(f(n));
		}
	static int f(int n) {
		if(n < 2) return n;
		else return f(n-1)+f(n-2);
		
	}
	

}
