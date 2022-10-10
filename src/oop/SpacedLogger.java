package oop;

public class SpacedLogger implements Logger{   //7
	
	@Override
	public void log(String log) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			result.append(log.charAt(i) + " ");

		}

		System.out.println("ERROR: " + result.toString());

	}

	@Override
	public void error(String error) {
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			message.append(error.charAt(i) + " ");  //10. added a space between each character
		}

		System.out.println();

		System.out.println("ERROR: " + message.toString());
	}
	

}
