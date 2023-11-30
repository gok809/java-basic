package class1.ex;

public class ProductOrderMain {
	public static void main(String[] args) {
		ProductOrder[] productOrder = new ProductOrder[3];
		productOrder[0] = createOrder("두부", 2000, 2);
		productOrder[1] = createOrder("김치", 5000, 1);
		productOrder[2] = createOrder("콜라", 1500, 2);

		printOrders(productOrder);

	}

	static ProductOrder createOrder(String productName, int price, int quantity){
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
