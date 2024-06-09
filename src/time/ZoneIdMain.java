package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

	public static void main(String[] args) {
		// ZoneId.getAvailableZoneIds() : 이용가능한 zoneid에 대한 정보 얻을 수 있다.
		for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
			//System.out.println("availableZoneId = " + availableZoneId);
			ZoneId zoneId = ZoneId.of(availableZoneId); // ZoneId를 객체로 구할 수 있다.
			System.out.println(zoneId + " | " + zoneId.getRules());
		}
		
		ZoneId zoneId = ZoneId.systemDefault(); // 운영체제가 가지고 있는 Zone 정보
		System.out.println("ZoneId.systemDefault = " + zoneId);
		
		ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
		System.out.println("seoulZoneId = " + seoulZoneId);
		
	}
	
}
