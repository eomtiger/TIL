package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	// behavior
	// method
	// inputs - int speed
	// outputs - void
	// name -setSpeed

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike started");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
