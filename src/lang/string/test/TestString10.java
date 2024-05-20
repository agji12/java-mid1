package lang.string.test;

public class TestString10 {

	public static void main(String[] args) {
		String fruits = "apple,banana,mango";
		
		String[] splitFruits = fruits.split(",");
		
		//분리하기
		for(String s : splitFruits) {
			System.out.println(s);
		}
		
		//합치기
		String joinedString = String.join("->", splitFruits);
		System.out.println("joinedString = " + joinedString);
		
	}
	
}
