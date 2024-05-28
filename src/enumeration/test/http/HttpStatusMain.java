package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("HTTP CODE: ");
		int codeInput = sc.nextInt(); // int로 입력받으면 된다.
		
		HttpStatus httpStatus = HttpStatus.findByCode(codeInput);
		if(httpStatus == null) {
			System.out.println("정의되지 않은 코드");
		}else {
			System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
			System.out.println("isSuccess = " + httpStatus.isSuccess());
		}
		
	}
	
}
