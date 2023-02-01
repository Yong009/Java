package com.yedam.oop;

public class Application02 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.sum(10, 20);
		int result = cal.sum2(10, 30);
		System.out.println(result);

		cal.sum3(new int[] { 1, 2, 3, 4, 5, 6, });
		cal.sum4(1, 2, 3, 4, 5, 6);

		cal.avg();
		Book book = new Book("혼자 공부하는 자바", "학습서", 24000, "한빛 미디어", 0001);
		book.getInfo();

	}
}
