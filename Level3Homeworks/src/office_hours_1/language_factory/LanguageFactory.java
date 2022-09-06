package office_hours_1.language_factory;

public class LanguageFactory {
	
	/*
	
	Create a class and name it Constants
	Add following constant variables:
	java
	python
	java script
	ruby

	Create another class and name it LanguageFactory
	create main method

	create String language variable

	create switch case that changes based on language
	and if case is java then print "I will code in Java"
	and if case is python then print "I will code in Python"
	and add all the constant variables that you created in Contants class as another case and print respective sentences.


	Submit your code as usual.

	*/
	
	public static void main(String[] args) {
		String language = "java";
		
		switch(language.toLowerCase()) {
		case Constants.JAVA:
			System.out.println("I will code in Java");
			break;
		case Constants.PYTHON:
			System.out.println("I will code in Python");
			break;
		case Constants.JAVA_SCRIPT:
			System.out.println("I will code in Java Script");
			break;
		case Constants.RUBY:
			System.out.println("I will code in Ruby");
			break;
		default:
			System.out.println("ERROR: I don't know that language: " + language);
		}
	}

}
