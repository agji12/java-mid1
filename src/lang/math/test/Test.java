package lang.math.test;

import java.util.Random;

public class Test {

	// Q1
	/*
	public static void main(String[] args) {
		int count = 0;

		while(count < 6) {
			System.out.println("count = " + count);
			count++;
		}

	}*/

	// Q2
	private Random random = new Random();
	
	public int[] generate() {
		int[] numbers = new int[3];
		int count = 0;
		while(count < 3) {
			int num = random.nextInt(45) + 1;
			numbers[count] = num;
			count++;
		}
		return numbers;
	}
	
	public static void main(String[] args) {
		//int[] numbers = generate();
		Test test = new Test();
		int[] numbers = test.generate();
		
		for(int i : numbers) {
			System.out.print(i + " ");
		}
	}

}
