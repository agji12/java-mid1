package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

	public static void main(String[] args) {
		
		//모든 ENUM 반환
		Grade[] values = Grade.values();
		System.out.println("values = " + Arrays.toString(values));
		for(Grade value : values) {
			System.out.println("name= " + value.name() + ", ordinal= " + value.ordinal());
		}
		
		//String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
		String input = "GOLD"; // 다만 잘못 입력하는 경우, 오류 발생
							   // Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enumeration.ex3.Grade.gold
		Grade gold = Grade.valueOf(input);
		System.out.println("gold = " + gold); // toString() 오버라이딩 가능
	}
	
}
