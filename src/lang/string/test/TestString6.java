package lang.string.test;

public class TestString6 {

	public static void main(String[] args) {
		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";
		
		int count = 0;
		int index = str.indexOf(key);
		while(index >= 0) { // 찾고자 하는 문자열이 있을 때까지 돌린다.
			index = str.indexOf(key, index+1); // 찾은 index 다음 칸부터 또 다시 찾는다.
			// index에 넣어줘야 한다 !!! 안그러면 무한 루프 돈다.
			System.out.println("index = " + index);
			count++;
		}
		System.out.println("count = " + count);
	}
	
}
