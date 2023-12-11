package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		// 같은 곳을 바라봄
		
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		// 다른 메모리에 할당됨
		
		if (str1 == str2) {
			System.out.println("같다");
		}
		
		if (str4 != str3) {
			System.out.println("다르다");
		}
		
		System.out.println(str1.substring(3));
	}

}
