import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Prob02 {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new File("Prob02.in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		
		int n = in.nextInt(); in.nextLine();
		for(int i = 0; i < n; i++) {
			int m = in.nextInt(); in.nextLine();
			BigInteger b = new BigInteger("0");
			for(int j = 0; j < m; j++) {
				b = b.add(new BigInteger(in.nextLine()));				
			}
			out.println(b.toString());
		}
			in.close(); out.close();
			Check.check("out.txt", "Prob02.out.txt");
	}

}
