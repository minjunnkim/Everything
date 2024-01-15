package SKILLS;

import java.util.regex.*;

public class PatternPractice {
	public static void main(String[] args) {
		String line = "ab";
		String pattern = "a?b";
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		System.out.println(m.matches());
		
		line = "aaaaaaaab";
		pattern = "a+b";
		r= Pattern .compile(pattern);
		m = r.matcher(line);
		System.out.println(m.matches());
	}
}
