package com.pratiti.trainingV3;

import java.time.LocalDateTime;

public class ConsoleLogger extends Logger {
	
	@Override
	public void log(String msg, LogLevel level) {
		switch(level) {
		case INFO:
			System.out.println("[INFO] [" + LocalDateTime.now() + "] "  + msg);
			break;
		case WARNING:
			System.out.println("[WARNING] [" + LocalDateTime.now() + "] " + msg);
			break;
		case ERROR:
			System.out.println("[ERROR] [" + LocalDateTime.now() + "] " + msg);
			break;
		}
		
	}
}
 