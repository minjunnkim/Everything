import java.io.File;
import java.io.*;
import java.util.*;

public class Check {

	public static void check(String s1, String s2) throws IOException {
		// prepare to read the file
    	Scanner mine = new Scanner(new File(s1));
    	Scanner correct = new Scanner(new File(s2));
    	int line = 0;
    	int wrong = 0;
		while(mine.hasNextLine()&&correct.hasNextLine()){
			line++;
			if(!mine.nextLine().equals(correct.nextLine()))
			{
				System.out.println("Wrong: " + line);
				wrong++;
			}
		}	
		if(wrong==0) System.out.println("OK!");
		mine.close();
		correct.close();
	}
}