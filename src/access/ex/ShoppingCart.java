package access.ex;


public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemCount;

	public void addItem(Item item) {
		if(itemCount >= items.length) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}

		items[itemCount] = item;
		itemCount++;
	}

	public void displayItems() {
		System.out.println("장바구니 상품 출력");

		/**
		* 아래처럼 try/catch 블록을 사용하지 않는 이유?
		 * 우선, try/catch와 if/else 의 차이점은 아래와 같다.
		 * try/catch: 블록
		 * if/else: 구문
		 * try/catch의 경우 실행파일 크기를 증가시키고, 속도를 저하시킨다. 때문에, 꼭 필요한 경우에만 사용한다.
		 * 되도록이면 try/catch는 피하되 if/else로 분기처리 할 수 있는 부분은 분기처리해주자.
		* */
		// try {
		/**
		 * 여기서 잘못된 점.
		 * items의 배열 크기는 10까지이므로, for문을 그냥 돌릴 경우 현재 배열크기가 작으면 null을 반환해준다.
		 * try/catch로 처리해줄 수 있지만, if/else로도 분기처리할 수 있으므로 로직 수정
		 * */
		// 	for (Item item : items) {
		// 		System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice() );
		// 	}
		//
		// } catch (Exception e) {
		// 	System.out.println(e);
		// }

		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice() );
		}

		System.out.println("전체 가격 합: " + totalPrice());
	}

	private int totalPrice() {
		int tempPrice = 0;

		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			tempPrice += item.getTotalPrice();
		}

		return tempPrice;
	}
}
