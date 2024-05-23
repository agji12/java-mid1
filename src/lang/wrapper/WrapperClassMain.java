package lang.wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
		Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf()를 사용
		Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용(자바가 미리 만들어둔다), 불변
		Long longObj = Long.valueOf(100);
		Double doubleObj = Double.valueOf(10.5);
		
		System.out.println("newInteger = " + newInteger); // toString() 오버라이딩 하고 있다.
		System.out.println("integerObj = " + integerObj);
		System.out.println("longObj = " + longObj);
		System.out.println("doubleObj = " + doubleObj);
		
		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue(); // integerObj 안에 있는 int 값을 꺼낼 수 있다.
		System.out.println("intValue = " + intValue);
		long longValue = longObj.longValue();
		System.out.println("longValue = " + longValue);
		
		System.out.println("비교");
		System.out.println("==: " + (newInteger == integerObj)); // 다른 참조 보고 있으니까
		System.out.println("equals: " + (newInteger.equals(integerObj)));
		
	}
	
}
