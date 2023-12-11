package javaStudy;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method1();
		
		myclass.method2(10);
		
		int i = myclass.method3();
		
		System.out.println(i);
		
		myclass.method4(10, 20);
		
		int j = myclass.method5(10);
		System.out.println(j);
	}

}
