package poly.ex.sender;

public class FacebookSender implements Sender {
	@Override
	public void sendMessage(String str) {
		System.out.println("페이스북을 발송합니다." + str);
	}
}
