package Learning;

import java.util.regex.Pattern;

public class Demo5 {
public static void main(String[] args) {
		
		boolean MatchingStatus = Pattern.matches("[^0-9]at", "Sat");
		
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
