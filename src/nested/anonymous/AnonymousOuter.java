package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

	private int outInstanceVar = 3;
	
	public void process(int paramVar) { // 코드 블럭 안에서만 LocalPrinter 사용 가능
		
		int localVar = 1; // 지역 변수
		
		// Printer를 상속받거나 구현하겠다
		Printer printer = new Printer() { // 인터페이스의 구현체를 이름 없이 만드는 것 만들고 new로 바로 생성  
			int value = 0;
			
			@Override
			public void print() {
				System.out.println("value=" + value);
				System.out.println("localVar=" + localVar);
				System.out.println("paramVar=" + paramVar);
				System.out.println("outInstanceVar=" + outInstanceVar);
			}
		};
		
		printer.print();
		System.out.println("printer.class = " + printer.getClass()); //class nested.anonymous.AnonymousOuter$1 익명 클래스는 이름이 없어 숫자로 나온다.
	}
	
	public static void main(String[] args) {
		AnonymousOuter main = new AnonymousOuter();
		main.process(2);
	}
	
}
