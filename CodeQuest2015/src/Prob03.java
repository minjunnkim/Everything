import java.util.*;
import java.io.*;

public class Prob03 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File ("Prob03.in.txt"));
		PrintWriter out = new PrintWriter(new File ("out.txt"));
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int m = in.nextInt();
			for(int j = 0; j < m; j++) {
				int year = in.nextInt();
				if(year < 1582) out.println("No");
				else if(year%4 != 0) out.println("No");
				else if(year%100 != 0) out.println("Yes");
				else if(year%400 != 0) out.println("No");
				else out.println("Yes");
			}
		}
		in.close(); out.close();
		Check.check("out.txt", "Prob03.out.txt");
	}
}
