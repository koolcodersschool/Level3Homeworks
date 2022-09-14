package office_hours_2.submit_assignment;

public class Assignment {
	
	/*

	Create a class and name it Assignment
	create the following static variables:
	 - String website
	 - String classroom

	Assign the following values to the respective static variables that you created earlier and make sure the values assigns to those variables only when you use Assignment class meaning when you create object from class or use any static method or variable from that class:
	 - the value of website variable will be "open www.gmail.com "
	 - the value of classroom variable will be "open classroom"


	Then create one static method (name it as submissionSteps) that prints the steps how you assign your homework one by one:
	- Go to classwork
	- Find assignment and click on it
	- Click on "View Assignment" button
	- Click on "Add or Create" button
	- Click on "File" button
	- Drag and drop Example.java class into "Upload" window
	- Click on "Turn in" button


	Create another class and name it SubmitAssignment 
	- create main method and call submissionSteps method and observe the results. 

	*/
	
	public static String website;
	public static String classroom;
	
	static {
		website = "open www.gmail.com";
		classroom = "open classroom";
		System.out.println(website);
		System.out.println(classroom);
	}
	
	public static void submissionSteps() {
		System.out.println("Go to classwork");
		System.out.println("Find assignment and click on it");
		System.out.println("Click on \"View Assignment\" button");
		System.out.println("Click on \"Add or Create\" button");
		System.out.println("Click on \"File\" button");
		System.out.println("Drag and drop Example.java class into \"Upload\" window");
		System.out.println("Click on \"Turn in\" button");
	}

}
