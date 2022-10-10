package oop;

public interface Logger {   // 1  Logger is the name of the interface
	
	public void log(String log);      //2 and 3
	public void error(String error);  //4

}


//Coding Steps — Object Oriented Programming:
//	1•	Create an interface named Logger.
//	2•	Add two void methods to the Logger interface, each should take a String as an argument
//	3•	Log
//	4•	Error
//	5•	Create two classes that implement the Logger interface
//	6•	AsteriskLogger
//	7•	SpacedLogger
//	8•	The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
//	9•	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
//
//****************
//***Error: Hello***
//****************
//	10•	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//	11•	If the log method received “Hello” as an argument, it should print H e l l o
//	12•	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
//	13•	Create a class named App that has a main method.
//	14•	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//	15•	Test both methods on both instances, passing in Strings of your choice.
