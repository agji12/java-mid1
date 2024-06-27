package exception.ex4.exception;

public class NetworkClientV5 implements AutoCloseable {

	private final String address;
	public boolean connectError; // true면 연결 실패
	public boolean sendError;

	public NetworkClientV5(String address) {
		this.address = address;
	}
	
	public void connect() {
		if(connectError) {
			throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
		}
		
		//연결 성공
		System.out.println(address + " 서버 연결 성공");
	}
	
	public void send(String data){
		if(sendError) {
			throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
			//throw new RuntimeException("ex");
		}
		
		//전송 성공
		System.out.println(address + " 서버에 데이터 전송: " + data);
	}
	
	public void disconnect() {
		System.out.println(address + " 서버 연결 해제");
	}
	
	// connectError, sendError 필드의 값을 true로 설정
	public void initError(String data) {
		if(data.contains("error1")) {
			connectError = true;
		}
		if(data.contains("error2")) {
			sendError = true;
		}
	}

	@Override
	public void close() { //예외가 안 터져서 throws Exception이 필요 없다
		// try 구문이 끝나고 자동으로 호출됨
		System.out.println("NetworkClientV5.close");
		disconnect();
		
	}
	
}
