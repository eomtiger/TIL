package javaStudy;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(1, 3));
		System.out.println(m.plus(2, 4, 3));
		System.out.println(m.plus("asd", "qwer"));
	}

}
