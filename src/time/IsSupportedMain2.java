package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now(); // 년, 월, 일만 있다.
		int minute = now.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("minute = " + minute);
		
	}
	
}
