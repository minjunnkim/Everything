import java.util.*;
import java.io.*;


public class Prob01 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("Prob01.in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int m = in.nextInt();
		for(int j = 0; j < m; j++) {
			int a = in.nextInt();
			for(int f = 0; f < a; f++) {
				for(int k = 0; k < a-1; k++) {
					out.print("# ");
				}
				out.print("#");
				out.println();
			}
		}
		in.close(); out.close();
		Check.check("out.txt", "Prob01.out.txt");
	}

}
