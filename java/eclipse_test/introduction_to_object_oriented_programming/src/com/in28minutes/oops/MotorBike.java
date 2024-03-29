package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behavior
	// method
	// inputs - int speed
	// outputs - void
	// name -setSpeed

	void start() {
		System.out.println("Bike started");
	}

	int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
