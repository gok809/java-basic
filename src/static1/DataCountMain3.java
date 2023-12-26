package static1;

public class DataCountMain3 {
	public static void main(String[] args) {
		Data3 data1 = new Data3("A");
		System.out.println("A count =" + Data3.count);

		Data3 data2 = new Data3("B");
		System.out.println("B count =" + Data3.count);

		Data3 data3 = new Data3("C");
		System.out.println("C count =" + Data3.count);

		//정적변수 접근법
		//1. 인스턴스를 통한 접근(추천X)
		//-> 코드 가독 시 인스턴스 변수에 접근하는 것처럼 오해 가능성 있음.
		Data3 data4 = new Data3("D");
		System.out.println(data4.count);
		//2. 클래스를 통한 접근(추천O)
		//-> 정적변수는 클래스에서 공용으로 관리하기 때문에, 클래스를 통해 접근하는 것이 명확함.
		System.out.println(Data3.count);
	}
}
