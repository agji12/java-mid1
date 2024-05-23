package lang.string.test;

public class TestString7 {

	public static void main(String[] args) {
		String original = " Hello Java ";
		System.out.println(original.trim());
		//System.out.println(original.strip());
		original.concat("bb");
		System.out.println(original);
		System.out.println(original.concat("aa"));
	}
	
}
