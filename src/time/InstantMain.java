package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantMain {

	public static void main(String[] args) {
		//생성
		Instant now = Instant.now(); //UTC 기준
		System.out.println("now = " + now);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		ZonedDateTime zdt2 = ZonedDateTime.of(2030,1,1,13,30,50,0,ZoneId.of("Asia/Seoul"));
		Instant from = Instant.from(zdt);
		System.out.println("from = " + from); // utc 시간으로 변경
		
		Instant epochStart = Instant.ofEpochSecond(0);
		System.out.println("epochStart = " + epochStart);
		
		//계산
		Instant later = epochStart.plusSeconds(3600); //1시간
		System.out.println("later = " + later);
		
		//조회
		long laterEpochSecond = later.getEpochSecond(); //epoch로부터 흐른 시간
		System.out.println("laterEpochSecond = " + laterEpochSecond);
		
	}
	
}
