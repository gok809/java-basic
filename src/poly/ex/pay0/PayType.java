package poly.ex.pay0;

public abstract class PayType implements IPay {
	public static IPay returnPay(String option){

		//기존 switch
		// switch (option) {
		// 	case "kakao" :
		// 		return new KakaoPay();
		// 	case "naver" :
		// 		return new NaverPay();
		// 	default :
		// 		return new DefaultPay();
		// }

		//17버전 switch
		switch (option) {
			case "kakao" -> {
				return new KakaoPay();
			}
			case "naver" -> {
				return new NaverPay();
			}
			default -> {
				return new DefaultPay();
			}
		}
	}
}
