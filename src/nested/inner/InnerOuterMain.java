package nested.inner;

public class InnerOuterMain {

	public static void main(String[] args) {
		InnerOuter outer = new InnerOuter();
		InnerOuter.Inner inner = outer.new Inner(); // 어떤 인스턴스를 생성할 것인지 알아야 한다
													// 이렇게 해야 Inner 클래스 입장에서 바깥 클래스에 있는 인스턴스 멤버를 알 수 있다
													// outer 인스턴스 안에 new Inner()를 만들어라 (Inner 인스턴스 내부에서 outer 인스턴스에 대한 참조값을 가지고 있다)
		inner.print();
		
		System.out.println("innerClass = " + inner.getClass());
		
	}
	
}
