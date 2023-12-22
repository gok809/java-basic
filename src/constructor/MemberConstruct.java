package constructor;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	// MemberConstruct(String name, int age) {
	// 	System.out.println("생성자 호출 name = " + name + "age = " + age );
	//
	// 	this.name = name;
	// 	this.age = age;
	// 	this.grade = 50;
	// }

	/**
	 * this() 사용
	 * */
	MemberConstruct(String name, int age) {
		this(name, age, 50);
	}

	/**
	 * this() 사용 시 컴파일 오류
	 * this()는 생성자 코드의 첫 줄에서만 사용할 수 있다.
	 * */
	// MemberConstruct(String name, int age) {
	// System.out.println("test");
	// 	this(name, age, 50);
	// }

	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name = " + name + "age = " + age + "grade = " + grade);

		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
