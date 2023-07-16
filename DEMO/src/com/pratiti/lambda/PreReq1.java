package com.pratiti.lambda;

// Interface
interface Sensor{
	void on();
	void off();
}
class TVSensor implements Sensor{
	@Override
	public void on() {	/* body */	}

	@Override
	public void off() {	/* body */	}
}

public class PreReq1 {
	public static void main(String[] args) {
		Sensor s= new TVSensor();   
		// object TVSensor chach banat aahe BUT reference/pointer Sensor type cha aahe
		s.on();
		s.off();
	}
}
