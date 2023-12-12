package javaStudy;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println(volume + "로 볼륨 바꿈");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println(channel + "로 채널 바꿈");

	}

}
