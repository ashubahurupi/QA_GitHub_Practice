package Learning;

import java.util.regex.Pattern;

public class Demo2 {

public static void main(String[] args) {
		
	System.out.println("Programm has been start from here");
	
		boolean MatchingStatus = Pattern.matches("ye[sp]", "yet");
		
		if(MatchingStatus)
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		System.out.println("Krish has Updated the Code");
		
	}
}
