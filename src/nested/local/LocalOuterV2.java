package nested.local;

public class LocalOuterV2 {

	private int outInstanceVar = 3;
	
	public void process(int paramVar) { // 코드 블럭 안에서만 LocalPrinter 사용 가능
		
		int localVar = 1; // 지역 변수
		
		class LocalPrinter implements Printer {
			int value = 0;
			
			@Override
			public void print() {
				System.out.println("value=" + value);
				System.out.println("localVar=" + localVar);
				System.out.println("paramVar=" + paramVar);
				System.out.println("outInstanceVar=" + outInstanceVar);
			}
		}
		
		LocalPrinter printer = new LocalPrinter();
		printer.print();
	}
	
	public static void main(String[] args) {
		LocalOuterV2 localOuter = new LocalOuterV2();
		localOuter.process(2);
	}
	
}
