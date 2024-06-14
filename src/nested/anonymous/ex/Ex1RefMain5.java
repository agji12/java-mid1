package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain5 {

	public static void hello(Process process) {
		System.out.println("프로그램 시작");

		//코드 조각 시작
		process.run();
		//코드 조각 종료

		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		
		//참조값을 변수에 따로 넣지 않고 바로 생성해서 메서드 실행하기
		hello(() -> {
			int randomValue = new Random().nextInt(6) + 1;
			System.out.println("주사위 = " + randomValue);			
		});
		
		hello(() -> {
			for(int i = 0;i < 3;i++) {
				System.out.println("i = " + i);
			}		
		});
	}
	
}
