package javaStudy;

public class CalExam {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		int i = cal.plus(1, 3);
		int j = cal.exec(3, 5);
		
		System.out.println(i);
		System.out.println(j);
		
		int k = Calculator.exec2(2, 3);
		
		System.out.println(k);
	}

}
