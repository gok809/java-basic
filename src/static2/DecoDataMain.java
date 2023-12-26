package static2;

import static static2.DecoData.staticCall; //특정 클래스의 특정 정적메소드를 적용.
//import static static2.DecoData.*; //특정 클래스의 모든 정적메소드를 적용하려면 .*를 사용할 것.

public class DecoDataMain {

	public static void main(String[] args) {
		System.out.println("1. 정적 호출");
		DecoData.staticCall();

		System.out.println("2. 인스턴스 호출1");
		DecoData data1 = new DecoData();
		data1.instanceCall();

		System.out.println("3. 인스턴스 호출2");
		DecoData data2 = new DecoData();
		data2.instanceCall();

		//인스턴스를 통한 접근
		DecoData data3 = new DecoData();
		data3.staticCall();

		//클래스를 통한 접근
		DecoData.staticCall();

		//static import
		//정적메소드를 사용할 때 자주 호출해야한다면, static import 기능을 고려해보자.
		staticCall(); //(클래스명 생략하고 메소드만 호출가능.)

	}
}
