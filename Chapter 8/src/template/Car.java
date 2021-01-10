package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 추상메서드는 아니지만 (특정) 하위 클래스에서 재정의해서 사용해야하는 메서드
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
