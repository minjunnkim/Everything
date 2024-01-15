
import java.util.Scanner;

public class MultipleOf {
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Input nubmber: ");
			int a = in.nextInt();
			
			if (a % 3 == 0)
				System.out.println(a + " is a multiple of 3 ");
			if (a % 5 ==0)
				System.out.println(a + " is a multiple of 5 ");
			
			
		}
}
