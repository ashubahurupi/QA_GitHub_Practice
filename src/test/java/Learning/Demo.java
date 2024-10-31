package Learning;

import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		boolean MatchingStatus = Pattern.matches("[Jj]ava", "java");
		
		if(MatchingStatus)
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
	}
}