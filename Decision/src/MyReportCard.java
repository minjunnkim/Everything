
public class MyReportCard {
		public static void main(String[] args) {
			int Eng = 99;
			int Math = 102;
			int Hist = 99;
			int Sci = 100;
			int total = Eng + Math + Hist + Sci;
			double avg = total / 4.0;
			System.out.println("My total score is " + total);
			System.out.println("My average score is " + avg);
			
			if(avg >= 90)
				System.out.println("Your grade is A");
			else if (avg >=80)
				System.out.println("Your grade is B");
			else if (avg >=70)
				System.out.println("Your grade is C");
			else if (avg >=60)
				System.out.println("Your grade is D");
			else
				System.out.println("Your grade is F");
		
			
		
		}
}
