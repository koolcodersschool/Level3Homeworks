package office_hours_4;

public class SeeColor {
	
	/*
	Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
	seeColor("redxx") → "red"
	seeColor("xxred") → ""
	seeColor("blueTimes") → "blue"
	*/
	
	public String seeColor(String str) {
	  String seeColor = "";
	  if(str.startsWith("red")){
	    seeColor = str.substring(0,3);
	  }else if (str.startsWith("blue")){
	    seeColor = str.substring(0,4);
	  }
	  
	  return seeColor;
	}

}
