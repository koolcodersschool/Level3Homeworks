package office_hours_1.language_factory;

public class LanguageFactory {
	
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
