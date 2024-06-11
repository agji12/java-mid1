package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

	public static void main(String[] args) {
		
		//생성
		Period period = Period.ofDays(10); //P10D (Period 10Days)
		System.out.println("period = " + period);
		
		//계산에 사용
		LocalDate currentDate = LocalDate.of(2030, 1, 1);
		LocalDate plusDate = currentDate.plus(period);
		System.out.println("currentDate = " + currentDate);
		System.out.println("plusDate = " + plusDate);
		
		//기간 차이
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 4, 2);
		Period between = Period.between(startDate, endDate); //P3M1D (Period 3Months 1Day)
		System.out.println("between = " + between);
		System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
		
	}
	
}
