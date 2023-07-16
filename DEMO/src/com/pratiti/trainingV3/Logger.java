package com.pratiti.trainingV3;

public abstract class Logger {		// abstract classes cha object nahi banavta yet
//	public interface Logger 		// all methods should abstract/default	
	public void log(String msg) {
		log(msg, LogLevel.INFO);
	}
	
	public abstract void log(String msg, LogLevel level);		// abstract = bhavishy me chield define karega
//	public void log(String msg, LogLevel level) { }

	
	
}


/*
public interface Logger{ 		// all methods should abstract/default	
								// class implements interface 
								// interface extends interface	
	public default void log(String msg) {
		log(msg, LogLevel.INFO);
	}
	
	public abstract void log(String msg, LogLevel level);		

}

*/