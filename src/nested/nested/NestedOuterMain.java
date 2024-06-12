package nested.nested;

public class NestedOuterMain {

	public static void main(String[] args) {
		NestedOuter outer = new NestedOuter();
		NestedOuter.Nested nested = new NestedOuter.Nested(); // new NestedOuter()와 아무 관계가 없다.
		nested.print();
		
		System.out.println("nestedClass = " + nested.getClass());
	}
	
}
