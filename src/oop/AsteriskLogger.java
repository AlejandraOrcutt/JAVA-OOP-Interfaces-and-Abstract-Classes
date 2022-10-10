package oop;

public class AsteriskLogger implements Logger {   //6   THIS IS AN ABSTRACT CLASS

	@Override                                     
	public void log(String log) {               //THIS IS AN ABSTRACT METHOD OR A SUBCLASS
		System.out.println("***" + log + "***");   //8
	}

	@Override
	public void error(String error) {   //9
		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");

		}
		System.out.println();  //this line is to add a jump to the next line

		System.out.println("***Error: " + error + "***");

		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
	}
}

}

//In Java, method overriding occurs when a subclass (child class) has the same method as the parent class. 
//In other words, method overriding occurs when a subclass provides a particular implementation of a method declared by one of its parent classes.