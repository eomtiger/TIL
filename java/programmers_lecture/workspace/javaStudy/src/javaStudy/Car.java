package javaStudy;

public class Car {
	//타입 필드명
	String name;
	int number;
	
//	public Car(String name) {
//		this.name = name;
//	}
	
	public Car(String name) {
//		this.name = "이름없음";
//		this.number = 0000;
		
//		this("이름없음", 0);
		System.out.println("car 기본생성자: "+ name);
	}
	
//	public Car(String name, it number) {
//		this.name = name;
//		this.number = number;
//	}
	
	public void run() {
		System.out.println("run!");
	}
}
