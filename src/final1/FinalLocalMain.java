package final1;

public class FinalLocalMain {
	public static void main(String[] args) {
		final int data1;
		data1 = 10; // 최초 1번만 할당가능

		final int data2 = 10;
		//data2 = 20; 컴파일오류

		method(10);
	}

	//final 매개변수
	static void method(final int parameter) {
		//parameter = 20; 컴파일 오류
	}
}
