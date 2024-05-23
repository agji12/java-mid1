package lang.math.test;

import java.util.Random;

public class LottoGenerator {

	Random random = new Random();
	
	public int[] generate() {
		int[] lotto = new int[6];
		int count = 0;
		while(count < 6) {
			int num = random.nextInt(45) + 1;
			
			if(overCheck(lotto, num, count)) {
				lotto[count] = num;
				count++;
			}
			
		}
		return lotto;
	}
	
	public boolean overCheck(int[] lotto, int num, int count) {
		for(int i = 0;i < count;i++) {
			if(lotto[i] == num) {
				return false;
			}
		}
		return true;
	}
	
}
