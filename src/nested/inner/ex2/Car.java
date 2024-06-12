package nested.inner.ex2;

public class Car {

	private String model;
	private int chargeLevel;
	private Engine engine;
	
	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new Engine();
	}

	/*
	//Engine에서만 사용하는 메서드
	public String getModel() { //외부에 open 됨 
		return model;
	}

	//Engine에서만 사용하는 메서드
	public int getChargeLevel() {
		return chargeLevel;
	}
	*/
	
	public void start() {
		engine.start();
		System.out.println(model + "시작 완료");
	}
	
	private class Engine {
		/*
		private Car car;

		public Engine(Car car) {
			this.car = car;
		}
		*/ // Car에 대한 정보가 없어도 내부클래스라 Car에 접근할 수 있다.
		
		public void start() { 
			System.out.println("충전 레벨 확인: " + chargeLevel);
			System.out.println(model + "의 엔진을 구동합니다.");
		}
		
	}
	
}
