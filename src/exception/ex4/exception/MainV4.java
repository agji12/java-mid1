package exception.ex4.exception;

import java.util.Scanner;

public class MainV4 {

	public static void main(String[] args) {
		//NetworkServiceV4 networkService = new NetworkServiceV4();
		NetworkServiceV5 networkService = new NetworkServiceV5();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("전송할 문자: ");
			String input = scanner.nextLine();
			if(input.equals("exit")) { // input이 exit 인 경우 종료
				break;
			}
			
			//공통으로 예외 처리
			try {
				networkService.sendMessage(input);				
			}catch(Exception e) { // 모든 예외를 다 잡는다
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}

	//공통 에외 처리
	private static void exceptionHandler(Exception e) {
		//공통 처리
		System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
		System.out.println("==개발자용 디버깅 메시지==");
		e.printStackTrace(System.out); //스택 트레이스 출력
		//e.printStackTrace();
		
		//필요하면 예외 별로 별도의 추가 처리 가능
		if(e instanceof SendExceptionV4 sendEx) { //다운캐스팅?
			System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
		}
	}
	
	
	
}