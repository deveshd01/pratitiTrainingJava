package com.pratiti.trainingV1;


public class LoggerTest {
	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.log("some info message", LogLevel.INFO);
		logger.log("some warning message", LogLevel.WARNING);
		logger.log("some error message", LogLevel.ERROR);
		

	}

}
