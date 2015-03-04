package ClassWorks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String S1 = "[A-Z a-z 0-9]+[@][A-Z a-z]+[.][co].+[^\\d]";
		Pattern P1 = Pattern.compile(S1);
		Matcher M1 =P1.matcher("1123@gmail.co.in");
		System.out.println(M1.matches());
		
	}

}

