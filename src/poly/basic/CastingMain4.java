package poly.basic;

/**
 * 다운캐스팅 주의점:
 * 심각한 런타임 오류 야기시킬 수 있음.
 * */
public class CastingMain4 {
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.childMethod(); //문제 없음.

		// Parent parent2 = new Parent(); //메모리상에 자식타입이 존재하지 않음.
		// Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
		// child2.childMethod(); //실행 불가.
	}
}
