package javaStudy;

public class InnerExam {
	
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();
		
		cal.plus();
		cal.plus();

		System.out.println(cal.value);
	}

}
