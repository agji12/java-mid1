package lang.string.chaining;

public class MethodChainingMain3 {

	public static void main(String[] args) {
		ValueAdder adder = new ValueAdder();
		int result = adder.add(1).add(2).add(3).getValue(); // adder.add(1) : x001 참조값 반환
		
		System.out.println("result = " + result);
	}
	
}
