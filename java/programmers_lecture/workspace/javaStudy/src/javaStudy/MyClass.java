package javaStudy;

public class MyClass {
	//public 리턴타입 메서드명 (매개변수들){ 구현 }
	public void method1() {
		System.out.println("m1 is executed");
	}
	
	public void method2(int x) {
		System.out.println("m2 is executed");
		System.out.println(x + " is used");
	}
	
	public int method3() {
		System.out.println("m3 is executed");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println("m4 is executed");
		System.out.println(x+y);
	}
	
	public int method5(int y) {
		System.out.println("m5 is executed");
		return y*2;
	}
}
