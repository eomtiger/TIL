package javaStudy;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel(11);
		tv.changeVolume(50);
	}

}
