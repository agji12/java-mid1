package lang.string.method;

public class StringUtilsMain1 {

	public static void main(String[] args) {
		int num = 100;
		boolean bool = true;
		Object obj = new Object();
		String str = "Hello, Java!";
		
		// valueOf 메서드
		String numString = String.valueOf(num);
		System.out.println("숫자의 문자열 값: " + numString);
		String boolString = String.valueOf(bool); // "true"
		System.out.println("불리언의 문자열 값: " + boolString);
		String objString = String.valueOf(obj); // obj.toString()을 반환함
		System.out.println("객체의 문자열 값: " + objString);
		
		// 문자 + x -> 문자
		String numString2 = "" + num; // "100"
		System.out.println("빈문자열 + num: " + numString2);
		
		// toCharArray 메서드
		char[] strCharArray = str.toCharArray();
		System.out.println("문자열을 문자 배열로 변환: " + strCharArray); // +가 들어가면 참조값 나옴
		//System.out.println(strCharArray); // String 값 나옴
		for(char c : strCharArray) {
			System.out.print(c);
		}
	}
	
}
