package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain2 {

	public static void hello(Process process) {
		System.out.println("프로그램 시작");

		//코드 조각 시작
		process.run();
		//코드 조각 종료

		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		
		class Dice implements Process {	//지역 클래스
			@Override
			public void run() {
				int randomValue = new Random().nextInt(6) + 1;
				System.out.println("주사위 = " + randomValue);			
			}
		}
		
		class Sum implements Process {
			@Override
			public void run() {
				for(int i = 0;i < 3;i++) {
					System.out.println("i = " + i);
				}			
			}
		}
		
		//Dice dice = new Dice();
		//Process dice = new Dice(); 부모는 자식을 담을 수 있기 때문에 Process라고 해도 된다.
		hello(new Dice());
		hello(new Sum());
	}
	
}
