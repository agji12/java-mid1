package lang.object.equals;

public class EqualsMainV2 {

	public static void main(String[] args) {
		UserV2 user1 = new UserV2("id-100");
		UserV2 user2 = new UserV2("id-100");
		
		System.out.println("identity = " + (user1 == user2));	// 인스턴스 비교(참조값 비교)
		System.out.println("equality = " + user1.equals(user2));
	}
	
}
