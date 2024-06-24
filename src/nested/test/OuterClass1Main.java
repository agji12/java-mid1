package nested.test;

import nested.test.OuterClass1.NestedClass;

public class OuterClass1Main {

	public static void main(String[] args) {
		//정답
		//OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
		
		new NestedClass().hello();
	}
	
}
