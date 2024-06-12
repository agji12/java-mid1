package nested;

public class ShadowingMain {

	public int value = 1;
	
	class Inner {
		public int value = 2;
		
		void go() {
			int value = 3;
			System.out.println("value = " + value); // 지역 변수가 우선 순위 가짐
			System.out.println("this.value = " + this.value); // this는 나의 인스턴스를 뜻함
			System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
		}
	}
	
	public static void main(String[] args) {
		ShadowingMain main = new ShadowingMain();
		Inner inner = main.new Inner();
		inner.go();
	}
	
}
