package lang.system;

import java.util.Arrays;

public class SystemMain {

	public static void main(String[] args) {
		// 현재 시간(밀리초)를 가져온다.
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currentTimeMillis = " + currentTimeMillis);
		
		// 현재 시간(나노초)를 가져온다.
		long currentTimeNano = System.nanoTime();
		System.out.println("currentTimeNano = " + currentTimeNano);
		
		// 환경 변수를 읽는다. - 운영체제
		System.out.println("getenv = " + System.getenv());
		
		// 시스템 속성을 읽는다. - 자바
		System.out.println("properties = " + System.getProperties());
		System.out.println("Java version = " + System.getProperty("java.version"));
		
		// 배열을 고속으로 복사한다.
		char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
		char[] copiedArray = new char[5];
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); // for문을 돌리지 않아도 복사가 된다. 통째로 읽어서 복사해서 속도가 빠르다.
		// 자바 -> 운영체제에게 넘겨 운영체제가 하드웨어와 같이 복사함
		
		// 배열 출력
		System.out.println("copiedArray = " + copiedArray);
		System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));
		
		// 프로그램 종료
		System.exit(0); // 자바가 끝남. 가급적이면 사용하지 말자.
		System.out.println("hello"); // 실행되지 않음
		
	}
	
}
