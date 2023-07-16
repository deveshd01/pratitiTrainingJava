package com.pratiti.trainingV2;

public class LoggerTest {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogger();
		logger.log("some message");
		logger.log("some info message", LogLevel.INFO);
		logger.log("some warning message", LogLevel.WARNING);
		logger.log("some error message", LogLevel.ERROR);
		
System.out.println("hi");
	}

}
