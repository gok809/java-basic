package class1.ex;

import java.util.Scanner;

/* 상품 주문 시스템 개발 - 사용자 입력 */
public class ProductOrderMain2 {
	public static void main(String[] args) {

		//입력받을 스캐너 생성
		Scanner in = new Scanner(System.in);

		//주문 갯수 입력
		System.out.println("입력할 주문의 개수를 입력하세요. :");
		int inputTotalQuantity = in.nextInt();
		ProductOrder[] productOrders = new ProductOrder[inputTotalQuantity];

		for (int i = 0; i < inputTotalQuantity; i++){
			System.out.println( (i+1) + "번째 주문 정보를 입력하세요. :");
			System.out.println("상품명:");
			String inputProductName = in.next();
			System.out.println("가격 :");
			int inputPrice = in.nextInt();
			System.out.println("수량 :");
			int inputQuantity = in.nextInt();

			//주문 객체 생성
			productOrders[i] = createOrder(inputProductName, inputPrice, inputQuantity);
		}

		//출력
		printOrders(productOrders);
	}

	static ProductOrder createOrder (String productName, int price, int quantity){
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}

	static void printOrders(ProductOrder[] orders){
		for (ProductOrder order : orders) {
			System.out.println("상품명:" + order.productName + "가격:" + order.price + "수량:" + order.quantity);
		}
		System.out.println("총 결제 금액:" + getTotalAmount(orders));
	}

	static int getTotalAmount(ProductOrder[] orders){
		int totalAmount = 0;
		for (ProductOrder order : orders){
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
}
