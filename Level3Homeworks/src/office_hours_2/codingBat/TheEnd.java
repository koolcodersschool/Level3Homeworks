package office_hours_2.codingBat;

public class TheEnd {
	
	/*

	Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
	theEnd("Hello", true) → "H"
	theEnd("Hello", false) → "o"
	theEnd("oh", true) → "o"


	submit screenshot from your codingbat account

	*/
	
	public String theEnd(String str, boolean front) {
		  String theEnd = "";
		  if(front == true){
		    theEnd += str.charAt(0);
		  }else{
		    theEnd += str.charAt(str.length()-1);
		  }
		  
		  
		  return theEnd;
	}

}
