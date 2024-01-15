package SKILLS;

import java.math.BigInteger;

public class BigIntegerPractice {
	
	public static void main(String[] args) {
		
		BigInteger b = new BigInteger("0");
		b = b.add(new BigInteger("13"));
		System.out.println(b.toString());
		
		BigInteger c = new BigInteger("150");	
		b = b.add(c);
		System.out.println(b);
	}
	
}
