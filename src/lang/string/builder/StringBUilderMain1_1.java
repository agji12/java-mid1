package lang.string.builder;

public class StringBUilderMain1_1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 변하는 byte[]을 가지고 있다.
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		System.out.println("sb = " + sb);
		
		sb.insert(4, "Java");
		System.out.println("insert = " + sb);
		
		sb.delete(4, 8); // 불변이 아니라 반환 값 안 써도 된다.
		System.out.println("delete = " + sb);
		
		sb.reverse();
		System.out.println("reverse = " + sb);
		
		// StringBuilder -> String
		String string = sb.toString(); // 불변으로 변경
		System.out.println("string = " + string);
		
	}
	
}
