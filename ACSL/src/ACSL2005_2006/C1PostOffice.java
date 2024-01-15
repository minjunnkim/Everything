package ACSL2005_2006;

import java.util.*;
import java.io.*;

public class C1PostOffice {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("0506C1.in"));
		
		for(int i = 0; i < 10;i++) {
			double L = in.nextDouble();
			double W = in.nextDouble();
			double T = in.nextDouble();
			if(L >= 3.5 && L <= 4.25 && W >= 3.5 && W <= 6 && T >= .007 && T <= .016) {
				System.out.println("regular post card");
			}
			else if(L >= 4.25 && L <= 6 && W >= 6 && W <= 11.5 && T >= .007 && T <= .016) {
				System.out.println("large post card");
			}
			else if(L >= 3.5 && L <= 6.125 && W >= 5 && W <= 11.5 && T >= .016 && T <= .25) {
				System.out.println("envelope");
			}
			else if(L >= 6.125 && L <= 24 && W >= 11 && W <= 18 && T >= .25 && T <= .5) {
				System.out.println("large envelope");
			}
			else if(L + 2*(W+T) >= 84 && L + 2*(W+T) <= 130) {
				System.out.println("Large Package");
			}
			else System.out.println("Unmailable");
		}

	}

}
