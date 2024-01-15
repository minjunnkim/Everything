import java.util.*;
import java.io.*;


public class Prob02 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("Prob02.in.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int n = in.nextInt(); in.nextLine();
		for(int i = 0; i < n; i++) {
			String a = in.nextLine();
			String b = a.substring(1);
			b = b.substring(0, b.indexOf(".")) + b.substring(b.indexOf(".") + 1);
			int money = Integer.parseInt(b);
			out.println(a);
			int quarters = 0;
			int dime = 0;
			int nickel = 0;
			int pennies = 0;
			while(money/25 >= 1) {
				money = money-25;
				quarters++;
			}
			out.println("Quarters=" + quarters);
			while(money/10 >= 1) {
				money = money-10;
				dime++;
			}
			out.println("Dimes=" + dime);
			while(money/5 >= 1) {
				money = money-5;
				nickel++;
			}
			out.println("Nickels=" + nickel);
			pennies = money;
			out.println("Pennies=" + pennies);
			
		}
		in.close(); out.close();
		Check.check("out.txt", "Prob02.out.txt");
	}

}
