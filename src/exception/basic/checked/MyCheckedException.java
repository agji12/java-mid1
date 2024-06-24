package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {

	public MyCheckedException(String message) {
		//메시지 보관
		super(message); // 무슨 오류가 발생했는지 왜 발생했는지에 대한 메시지를 부모에 저장
	}
	
}
