package office_hours_2.codingBat;

public class NonStart {
	
	/*

	Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
	nonStart("Hello", "There") → "ellohere"
	nonStart("java", "code") → "avaode"
	nonStart("shotl", "java") → "hotlava"


	Submit screenshot from codingbat account

	*/
	
	public String nonStart(String a, String b) {
		  String nonStart = "";
		  if(a.length() > 1){
		    nonStart += a.substring(1);
		  }
		  
		  if(b.length() > 1){
		    nonStart += b.substring(1);
		  }
		  
		  
		  return nonStart;
	}

}
