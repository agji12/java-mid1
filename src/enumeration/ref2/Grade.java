package enumeration.ref2;

public enum Grade {
	BASIC(10), GOLD(20), DIAMOND(30);
	
	private final int discountPercent;
	
	// 아래의 생성자를 통해 인스턴스 생성
	Grade(int discountPercent){ // private이 생략된 거라고 보면 된다.
		 this.discountPercent = discountPercent;
	}
	
	public int getDiscountPercent() {
		return discountPercent;
	}
	
}
