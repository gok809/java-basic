package access.ex;

/**
* 최대값을 지정하고, 최대값까지만 값이 증가하는 기능을 제공한다.
* */
public class MaxCounter {
	private int count;
	int max;

	public MaxCounter() {
		count = 0;
	}

	MaxCounter(int max) {
		this.max = max;
	}

	public void increment() {
		if(count >= max) {
			System.out.println("최대값을 초과할 수 없습니다.");
			return;
		}
		count++;
	}

	public int getCount() {
		return count;
	}

}
