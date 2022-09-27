package office_hours_4;

public class ExtraFront {
	
	/*
	Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
	extraFront("Hello") → "HeHeHe"
	extraFront("ab") → "ababab"
	extraFront("H") → "HHH"
	*/
	
	public String extraFront(String str) {
		  String extraFront = "";
		  if(str.length() > 1){
		    extraFront = str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
		  }else if (str.length() == 1){
		    extraFront = str + str + str;
		  }
		  return extraFront;
	}

}
