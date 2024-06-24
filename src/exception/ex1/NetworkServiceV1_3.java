package exception.ex1;

public class NetworkServiceV1_3 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV1 client = new NetworkClientV1(address);
		client.initError(data); //추가 - 에러 처리
		
		String connectResult = client.connect();
		//결과가 성공이 아니다 -> 오류다. : 오류다가 이해하기 더 쉽다.
		//if(!connectResult.equals("success")) {
		if(isError(connectResult)) { //connectResult가 오류면
			System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
		}else {
			String sendResult = client.send(data);
			if(!sendResult.equals("success")) {
				System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
			}
		}
		
		client.disconnect();
	}
	
	private static boolean isError(String connectResult) {
		return !connectResult.equals("success");
	}
	
}
