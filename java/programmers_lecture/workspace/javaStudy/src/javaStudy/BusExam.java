package javaStudy;

public class BusExam {

	public static void main(String[] args) {
//		Bus bus = new Bus();
//		bus.run();
//		bus.pang();
		
		Car car = new Bus();
		car.run();
//		car.pang();
		
		Bus bus = (Bus) car;
		bus.pang();
	}

}
