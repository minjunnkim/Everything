package ACSL2015_2016;
import java.util.*;
import java.io.*;

public class C2Strings {
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(new File("1516C2.in"));
			
			String S = in.nextLine();
			for (int i=0;i<8;i++) {
				int n1 = in.nextInt();
				int n2 = in.nextInt();
				
				if(n1!=n2 && n1 >= 0 && n2 >= 0) {
					System.out.println(S.substring(n1,n2)); 
				}
				else if(n1==n2) {
					System.out.println(S.substring(n1));
				}
				else if(n1 >= 0 && n2 < 0) {
					n2 = n2 + 12;
					System.out.println(S.substring(n1,n2));
				}
				else if(n2 >= 0 && n1 < 0) {
					n1 = n1 + 12;
					System.out.println(S.substring(n1));
				}
				else if(n2 < 0 && n1 < 0) {
					n1 = n1 + 12;
					n2 = n2 + 12;
					System.out.println(S.substring(n1,n2));
				}
			}
		
		}
}
