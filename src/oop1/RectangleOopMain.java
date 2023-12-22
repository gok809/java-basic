package oop1;

/**
 * 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
 * */
public class RectangleOopMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		int width = 5;
		int height = 8;

		int area = rectangle.calculateArea(width, height);
		System.out.println("넓이: " + area);

		int perimeter = rectangle.calculatePerimeter(width, height);
		System.out.println("둘레 길이:" + perimeter);

		boolean square = rectangle.isSquare(width, height);
		System.out.println("정사각형 여부: " + square);




	}
}
