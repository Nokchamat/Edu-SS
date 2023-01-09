package ch11_1;

public class LoggerTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();
		
		myLogger.log("test");
	}

}