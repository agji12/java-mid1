package lang.object.poly;

public class ObjectPolyExample1 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		action(dog);
		action(car);
	}
	
	private static void action(Object obj) {
		//obj.sound();
		//obj.move();
		// Object 타입에는 sound(), move() 메서드가 없기 때문에 당연히 안 된다! 컴파일 오류 발생
		
		// 다운캐스팅하면 sound() 메서드를 사용할 수 있다.
		if(obj instanceof Dog dog) {
			dog.sound();
		}else if(obj instanceof Car car) {
			car.move();
		}
	}
}
