package constructor;

/**
 * 생성자 필요 이유 - 테스트
 * */
public class MemberInit {
	String name;
	int age;
	int grade;

	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

}
