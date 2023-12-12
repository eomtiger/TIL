package javaStudy;

public class Bus extends Car {
	public Bus() {
		super("타요");
		
	}
	public void pang() {
		System.out.println("빵빵!");
	}
	
	public void run() {
		super.run();
		System.out.println("bus run method");
	}
}
