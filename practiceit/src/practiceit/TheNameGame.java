package practiceit;

public class TheNameGame {
		public static void main(String []args) {
			double gpa = 3.2;
			double credits = gpa * 3;
			System.out.println(credits);
			if (credits == 9.6 || credits >= 9.6 && credits <= 9.61) {
			    System.out.println("You earned enough credits.");
			}
		}
}
