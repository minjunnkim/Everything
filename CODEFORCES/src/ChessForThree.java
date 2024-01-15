import java.util.*;

public class ChessForThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int Spectator = 3;
		boolean check = true;
		
		for(int i=0;i<n; i++) {
			int a = in.nextInt();
			if (a == Spectator) {
				System.out.println("NO");
				check = false;
				break;
			}
			Spectator = 6 - a - Spectator;
				
		}
		if(check) {
		System.out.println("YES");
		}
	}
}
