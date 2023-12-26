package final1;

//final 필드 - 생성자 초기화
public class ConstructInit {
	final int value;

	/**
	 * final 필드는 생성자를 통해 1번만 초기화 할 수 있다.
	 * */
	public ConstructInit(int value) {
		this.value = value;
	}
}
