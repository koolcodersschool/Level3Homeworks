package office_hours_2.codingBat;

public class FirstHalf {
	
	/*

	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	firstHalf("WooHoo") → "Woo"
	firstHalf("HelloThere") → "Hello"
	firstHalf("abcdef") → "abc"


	submit screenshot from your codingbat account

	*/
	
	public String firstHalf(String str) {
		  String firstHalf = "";
		  firstHalf = str.substring(0, str.length()/2);
		  
		  return firstHalf;
	}

}
