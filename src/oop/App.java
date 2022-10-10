package oop;

public class App {  //13
	
	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();  //14. instances instantiated
		Logger logger2 = new SpacedLogger();
		
		logger1.log("This is a test");
		logger1.error("This is a another error");
		logger2.error("This is a error");
		logger2.log("This is a test");
		
	}
	

}
