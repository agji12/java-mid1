package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		printCalendar(year, month);
	}
	
	public static void printCalendar(int year, int month) {
		LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
		LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
		
		//월요일=1 ... 일요일 7(7%7=0)
		int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; //%7로 나눠줘야 일요일 값이 0
		
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i = 0;i < offsetWeekDays;i++) {
			System.out.print("   ");
		}
		
		LocalDate dayIterator = firstDayOfMonth;
		while(dayIterator.isBefore(firstDayOfNextMonth)) { //다음 달 전까지
			//System.out.print(dayIterator.getDayOfMonth() + " "); //1 ~ 9 칸을 세칸으로 맞춰줘야 함
			System.out.printf("%2d ", dayIterator.getDayOfMonth()); //오른쪽으로 정렬해줌 %2 -> 두칸을 차지해라
			if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			dayIterator = dayIterator.plusDays(1);
		}
		
	}
	
}
