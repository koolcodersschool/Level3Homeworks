package office_hours_3;

public class MiddleTree {
	
	/*

	Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
	middleThree("Candy") → "and"
	middleThree("and") → "and"
	middleThree("solving") → "lvi"


	send your codingbat screenshot here

	*/
	
	public String middleThree(String str) {
		  String middleThree = "";
		  if(str.length() > 2){
		    middleThree = str.substring((str.length()/2)-1, (str.length()/2)+2);
		  }
		  
		  
		  return middleThree;
		}

}
