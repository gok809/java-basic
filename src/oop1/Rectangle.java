package oop1;

/**
 * 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
 * */
public class Rectangle {

	int calculateArea(int width, int height) {
		return width * height;
	}

	int calculatePerimeter(int width, int height) {
		return 2 * (width + height);
	}

	boolean isSquare(int width, int height) {
		return width == height;
	}
}
