package com.pratiti.trainingV3;

public class LoggerTest {

	public static void main(String[] args) {
//		Logger logger = new ConsoleLogger();
		Logger logger = LoggerFactory.getLoggerInstance();
		logger.log("some message");
		logger.log("some info message", LogLevel.INFO);
		logger.log("some warning message", LogLevel.WARNING);
		logger.log("some error message", LogLevel.ERROR);
		
System.out.println("hi");
	}

}
