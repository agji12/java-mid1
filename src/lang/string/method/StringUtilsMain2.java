package lang.string.method;

public class StringUtilsMain2 {

	public static void main(String[] args) {
		int num = 100;
		boolean bool = true;
		String str = "Hello, Java!";
		
		// format 메서드
		// d: 숫자 / b: boolean / s: 문자열
		String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str); // format에 맞춰 차례대로 들어간다
		System.out.println(format1);
		
		String format2 = String.format("숫자: %.2f", 10.1234); // 소수점 2자리까지 출력
		System.out.println(format2);
		
		// prinf
		System.out.printf("숫자: %.2f\n", 10.1234); // printf 사용하면 바로 출력 가능
		
		// matches 메서드
		String regex = "Hello, (Java!|World)";
		System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
	}
	
}
