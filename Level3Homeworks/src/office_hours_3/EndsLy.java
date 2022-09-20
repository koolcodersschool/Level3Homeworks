package office_hours_3;

public class EndsLy {
	
	/*
	Given a string, return true if it ends in "ly".
	endsLy("oddly") → true
	endsLy("y") → false
	endsLy("oddy") → false


	send coding bat screen shot here

	*/
	
	public boolean endsLy(String str) {
		  boolean endsLy = false;
		  if(str.endsWith("ly")){
		    endsLy = true;
		  }
		  
		  
		  return endsLy;
		}

}
