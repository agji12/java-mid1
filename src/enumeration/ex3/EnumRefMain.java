package enumeration.ex3;

public class EnumRefMain {

	public static void main(String[] args) {
		System.out.println("class BASIC = " + Grade.BASIC.getClass());
		System.out.println("class GOLD = " + Grade.GOLD.getClass());
		System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
		
		System.out.println("ref BASIC = " + refValue(Grade.BASIC)); //43a25848 (x001)
		System.out.println("ref GOLD = " + refValue(Grade.GOLD)); //3ac3fd8b (x002)
		System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND)); //5594a1b5 (x003)
		// 참조값이 다 다르다.
	}
	
	private static String refValue(Object grade) {
		return Integer.toHexString(System.identityHashCode(grade));
	}
	
}
