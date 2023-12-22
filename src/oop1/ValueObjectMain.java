package oop1;

public class ValueObjectMain {
	public static void main(String[] args) {
		ValueObject valueObject = new ValueObject();
		valueObject.add();
		valueObject.add();
		valueObject.add();
		System.out.println("최종 숫자 =" + valueObject.value);
	}

	static void add(ValueData valueData) {
		valueData.value++;
		System.out.println("숫자 증가 value=" + valueData.value);
	}
}
