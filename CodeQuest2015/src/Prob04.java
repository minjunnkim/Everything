import java.util.*;
import java.io.*;

public class Prob04 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("Prob04.in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = in.nextInt(); in.nextLine();
		for (int i = 0; i < n; i++) {
			int m = in.nextInt(); in.nextLine();
			for(int j = 0; j < m; j++) {
				String a = in.nextLine();
				String[] b = a.split(" ");
				double num = Double.parseDouble(b[0]);
				String deg = b[1];
				double ans = 0;
				if (deg.equals("C")) {
					ans = (num*9)/5 + 32;
					
					out.printf("%s = %.1f F\n", a, ans);
				}
				else {
					ans = (5*(num-32))/9;
					out.printf("%s = %.1f C\n", a, ans);
				}
				
			}
		}
		in.close(); out.close();
		Check.check("out.txt", "Prob04.out.txt");

	}

}
