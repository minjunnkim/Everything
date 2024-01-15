import java.util.Scanner;
import java.util.Random;

public class GuessGame {
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner (System.in);
			Random r = new Random();
			
			
			int c = r.nextInt(100) + 1; //computer picks number between 1 and 100
			int m = 0;
			int tries = 0;
			
			 
			while (c!=m) {
				tries++;
				System.out.print("Input number 1 ~ 100: ");
				m = in.nextInt();  //The user picks the number 1 ~ 100
				
			while (m<1 || m>100) {
				System.out.println("Invalid Number Try Again.");
				System.out.print("Input number 1 ~ 100: ");
				m = in.nextInt();
			}
				
				if (c > m) System.out.println("Too low");
				else if (c < m) System.out.println("Too high");
				else System.out.println("Correct!");
				
				
			}
			
			System.out.println("This is how much tries it took: " + tries);
			
			//print how many tries it took
			
		}
}