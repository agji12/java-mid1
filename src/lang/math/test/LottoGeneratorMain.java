package lang.math.test;

public class LottoGeneratorMain {
	public static void main(String[] args) {
		LottoGenerator generator = new LottoGenerator();
		int[] lotto = generator.generate();
		String lottoStr = "";
		
		for(int i : lotto) {
			lottoStr += i + " ";
		}
		
		System.out.println("로또 번호 : " + lottoStr);
		
		// 이렇게 출력해도된다.
		/*
		System.out.print("로또 번호 : ");
		for(int i : lotto) {
			System.out.print(i + " ");
		}
		*/
	}
}
