package practiceit;

public class stringExpression2 {

	public static void main(String[] args) {
		String str1 = "Q.E.D.";
		String str2 = "Arcturan Megadonkey";
		String str3 = "Sirius Cybernetics Corporation";
		
		System.out.println(str3.indexOf("X"));
		System.out.println(str2 + str3.charAt(17));
		System.out.println(str3.substring(9, str3.indexOf("e")));
		System.out.println(str3.substring(7, 12));
		System.out.println(str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7));
	}

}
