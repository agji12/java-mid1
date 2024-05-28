package enumeration.test.http;

public enum HttpStatus {

	OK(200, "OK"),
	BAD_REQUEST(400, "Bad Request"),
	NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error");

	private final int code;
	private final String message;
	
	HttpStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public boolean isSuccess() {
		return code >= 200 && code <= 299; //200보다 크거나 같고 299보다 작거나 같은 경우 true 반환
	}

	// 입력받은 Code로 HttpStatus 찾기
	public static HttpStatus findByCode(int codeInput) {
		//HttpStatus[] values = values(); // 자기 자신이라 HttpStatus.values()에서 HttpStatus 생략
		for(HttpStatus status : values()) {
			if(status.getCode() == codeInput) {
				return status;
			}
		}
		return null;
	}
	
}
