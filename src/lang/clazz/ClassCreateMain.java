package lang.clazz;

public class ClassCreateMain {
	public static void main(String[] args) throws Exception {
		//Class helloClass = Hello.class;
		Class helloClass = Class.forName("lang.clazz.Hello");
		
		Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // Hello 클래스가 가진 생성자를 얻어 객체 생성 - Object 반환
		String result = hello.hello();
		System.out.println("hello = " + hello);
		System.out.println("result = " + result);
	}
}
