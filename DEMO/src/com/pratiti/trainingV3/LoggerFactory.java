package com.pratiti.trainingV3;

public class LoggerFactory {
	
	public static Logger  getLoggerInstance() {
		return new ConsoleLogger();
	}

}
