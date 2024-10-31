package Learning;

import java.util.regex.Pattern;

public class Demo3 {
	public static void main(String[] args) {
		
	boolean MatchingStatus = Pattern.matches("[skl]it", "lit");
	
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
