package javaStudy;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++){
//			if (i % 2 != 0) {
//				continue;
//			}
			if (i == 51) {
				break;
			}
			total += i;
		}
		System.out.println(total);
	}

}
