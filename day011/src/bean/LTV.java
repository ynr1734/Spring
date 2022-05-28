package bean;

import frame.TV;

public class LTV implements TV {

	public LTV() {
		System.out.println("Create LG TV Bean ...");
	}
	
	@Override
	public void on() {
		System.out.println("LG TV ON...");
	}

	@Override
	public void off() {
		System.out.println("LG TV OFF...");
	}

}
