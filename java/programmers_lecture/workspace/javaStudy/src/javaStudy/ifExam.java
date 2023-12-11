package javaStudy;

public class ifExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
//		if (x < y) {
//			System.out.println("x는 y보다 작다");
//		}
		
		if (x == y) {
			System.out.println("x equals y");
		}else if(x>y) {
			System.out.println("x is bigger than y");
		}else {
			System.out.println("x differs to y");
		}
	}

}
