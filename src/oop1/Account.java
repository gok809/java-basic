package oop1;

/**
 * 객체 지향 계좌 문제
 * */
public class Account {
	int balance = 0;

	/**
	 * 입금
	* */
	void deposit(int amount) {
		balance += amount;
	}

	/**
	 * 출금
	 * */
	void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
