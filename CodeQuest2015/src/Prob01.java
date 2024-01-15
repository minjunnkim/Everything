import java.util.*;
import java.io.*;

public class Prob01 {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new File("Prob01.in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = in.nextInt(); in.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			int m = in.nextInt(); in.nextLine();
			
			for(int j = 0; j < m ; j++) {
				String first = in.next().toUpperCase();
				String mid = in.next().toUpperCase();
				String last = in.next().toUpperCase();
				
				out.println("" + first.charAt(0) + last.charAt(0) + mid.charAt(0));
			}
		}
		
		in.close(); out.close();
		Check.check("out.txt", "Prob01.out.txt");
		
	}

}
