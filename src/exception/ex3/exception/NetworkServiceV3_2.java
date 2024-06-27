package exception.ex3.exception;

public class NetworkServiceV3_2 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data);
		
		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 e) { // 우선 순위라 ConnectException은 여기서 잡히게 된다.
			System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
		} catch (NetworkClientExceptionV3 e) {
			System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
		} catch (Exception e) { // 일반적으로 사용하는 모든 예외의 부모 (RuntimeException도 포함)
			System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
		} finally {
			client.disconnect();
		}
		
	}
	
}
