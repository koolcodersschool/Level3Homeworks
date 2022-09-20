package office_hours_3;

public class LastChars {
	
	/*


	Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
	lastChars("last", "chars") → "ls"
	lastChars("yo", "java") → "ya"
	lastChars("hi", "") → "h@"


	send your codingbat screetshot here

	*/
	
	public String lastChars(String a, String b) {
		  String lastChars = "";
		  if(a.length() > 0){
		    lastChars += a.charAt(0);
		  }else{
		    lastChars += "@";
		  }
		  
		  if(b.length() > 0){
		    lastChars += b.charAt(b.length()-1);
		  }else{
		    lastChars += "@";
		  }
		  
		  
		  return lastChars;
		}

}
