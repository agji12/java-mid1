package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		
		for(int i = 0;i < 5;i++) {
			System.out.println("날짜 " + (i+1) + ": " + startDate);
			startDate = startDate.plus(2, ChronoUnit.WEEKS);
			//startDate = startDate.plusWeeks(2);
			
			//아래와 같이 해도 된다
			//LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
			//System.out.println("날짜 " + (i+1) + ": " + nextDate);
		}
	}
	
}
