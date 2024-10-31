package Learning;

import java.util.regex.Pattern;

public class Demo4 {

public static void main(String[] args) {
		
		boolean MatchingStatus = Pattern.matches(".ava", "wava");
		
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
